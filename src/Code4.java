import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Code4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int i = 0;

        do  {
            System.out.print("Guess a number between 1 - 100: ");
            guess = scanner.nextInt();
            i++;

            if (guess < randomNumber) {
                System.out.println("Higher");
            }
            else if (guess > randomNumber) {
                System.out.println("Lower");
            }
            else System.out.println("CORRECT, my number was " + randomNumber + ".");

        }  while (guess != randomNumber);
        System.out.println ("It took you " + i + " to guess correctly.");

    }
}

