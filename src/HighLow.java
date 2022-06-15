import java.util.Scanner;

public class HighLow {

    public static void playGame() {
        Scanner scan = new Scanner(System.in);
        boolean decision = true;
        int randomNumber = (int) (Math.random() * 100) + 1;
        int numOfGuesses = 5;

        while (decision) {
            if (numOfGuesses == 0) {
                System.out.println("to many guesses! you loose");
                break;
            }
            System.out.println("guess the number between 1 - 100");
            int userAnswer = scan.nextInt();
            if (userAnswer == randomNumber) {
                System.out.println("good guess");
                System.out.println("want to play again");
                String userChoice = scan.next();
                if (userChoice.equalsIgnoreCase("no")) {
                    decision = false;
                }
            } else if (userAnswer < randomNumber) {
                System.out.println("Higher");

            } else if (userAnswer > randomNumber) {
                System.out.println("lower");

            }
            numOfGuesses--;
            System.out.println("you have " + numOfGuesses + "left");
        }
    }

    public static void main(String[] args) {
playGame();
    }
}
