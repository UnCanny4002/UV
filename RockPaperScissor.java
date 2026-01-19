import java.util.Random;
import java.util.Scanner;

class RockPaperScissor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        while(true)
        {
        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine();

        int computerIndex = random.nextInt(3);
        String computerChoice = choices[computerIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        System.out.println("wanna play again?: ");
        String x=scanner.nextLine();
        if(x.equalsIgnoreCase("yes"))
        {
            
        }
        else
        {
            System.out.println("See ya ,have a great day!!");
            break;
        }
        }

        scanner.close();
    }
}
