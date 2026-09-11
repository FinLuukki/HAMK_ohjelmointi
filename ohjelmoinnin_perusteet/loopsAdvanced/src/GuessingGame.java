import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String answer = "Emma";
        int guesses = 0;

        while (true) {

            System.out.println("Guess my name (type stop to exit)");
            String guess = scanner.nextLine();

            if (guess.equals("stop")) {
                break;
            }

            guesses++;

            if (guess.equals(answer)) {
                System.out.println("Congratulations!");
                break;
            }
        }

        System.out.println("You guessed " + guesses + " times.");

        scanner.close();
    }
}
