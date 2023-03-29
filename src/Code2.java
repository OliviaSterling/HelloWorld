import java.util.Scanner;

public class Code2  {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("\n");

        System.out.print("Age: \n");
        int year = scanner.nextInt();
        System.out.println("\n");

        System.out.print("You have ");
        System.out.print(firstName. length());
        System.out.print(" characters in your name.\n\n");

        System.out.println("Your have lived for " + year + " years. In another " + year + " years you'll be " + (year+year) + ".");

    }
}

