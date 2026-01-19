import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x=1;

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {
            int randomNumber = random.nextInt(100) + 1; // 1 to 100
            int guess = 0;

            System.out.println("Guess the number between 1 and 100:");

            while (guess != randomNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < randomNumber) {
                    System.out.println("Go Higher.");
                    x++;
                } else if (guess > randomNumber) {
                    System.out.println("Go Lower.");
                    x++;
                } else {
                    System.out.println("Exactly! You did it on the "+x+"th turn!");
                }
            }

            System.out.print("wanna play again?: ");
            playAgain = scanner.next();
        }

        System.out.println("okay let's pack it up!");
        scanner.close();
    }
}