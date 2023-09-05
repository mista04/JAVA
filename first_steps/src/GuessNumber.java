import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        // Create the scanner for input.
        Scanner scanner = new Scanner(System.in);

        // Create de number of attempts.
        int attemps = 0;

        System.out.println("Max number for guess: ");
        int maxNumber = scanner.nextInt();

        // Create a random number between min and max.
        double randomNumber = (Math.random() * maxNumber) + 1;
        int intValue = (int) Math.round(randomNumber);

        // Loop game
        System.out.println("Guess the number between 1 and " + maxNumber);

        while (attemps < 6){
            System.out.println("Try to guess: ");
            int guess = scanner.nextInt();

            if (guess == intValue) {
                System.out.println("You guessed!!");
                break;

            } else {
                System.out.println("Try it again...");
                attemps++;
            }
            

        }


    }

}
