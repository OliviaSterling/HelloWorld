import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Code3 {

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.print("Please type in a number between 1 - 5: ");
        int userGuess = scanner.nextInt();
        System.out.println();

        if (userGuess == randomNumber) {
            System.out.print("Correct!");
        } else {
            System.out.print("Nice try! But not correct. Have another guess: ");
            int userGuess2 = scanner.nextInt();

            if (userGuess2 == randomNumber) {
                System.out.print("Lovely!");
            } else {
                System.out.print("Better luck next time");
            } }}}

