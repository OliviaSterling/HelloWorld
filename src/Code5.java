import java.util.Scanner;

public class Code5 {
    public static void main (String[] args) {
        //use method by typing
        tests();
    }

    public static void testone () {
        // Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.
        int[] arbEl = {47, 50, 95, 32, 44, 22, 34, 78, 90, 60};

        for (int e : arbEl) {
            System.out.println(e);
        }
    }

    public static void test2 () {
        // Use a loop to populate an array with integers from 1 to 20. Use another loop to print the contents of the array (the elements) backwards.
        int [] array = new int [20];

        for ( int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        for ( int e = 19; e > -1; e--) {
            System.out.println(array[e]);
        }
    }

    public static void test3 () {
        // Create an array of five doubles and give each element some value. Calculate the sum of all the elements and print the result.
        // Calculate the mean/average of the all the elements and print that too.
        double[] randNums = {7.8, 4.3, 8.0, 3.0, 2.9};

        double sumNums = 0;
        int k = 0;
        double avgRandNums = 0;

        for (int q = 0; q < 5; q++){
            sumNums = sumNums + randNums[q];
            k++;
        }

        avgRandNums = (sumNums/k);

        System.out.println("The sum of the elements of variable \"sumNums\" is: " + sumNums + ".");

        System.out.println("The average of the elements of variable \"randNums\" is: " + avgRandNums + ".");
    }

    public static void tests () {
        // Write a program which asks the user to enter their top three favourite foods and store their answers in a string array.
        // However, create the array so it can only hold a maximum of three strings. After the user enters the third item,
        // print “No more memory available.”, then print out the contents of the array.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey! What is yor name?: ");
        String Name = scanner.nextLine();

        String[] favFoods = new String[3]; // Variable holding 3 empty elements to store favorite foods
        System.out.println("Welcome " + Name + ", please type in your 3 favorite foods in no particular order");
        for (int i = 0; i < 3; i++){
            System.out.println("Food " + (i+1) + ": ");
            favFoods[i] = scanner.nextLine();

        }

        System.out.println("Thank you!");

        System.out.println("Your favorite foods are: " + favFoods[0] + " , " + favFoods[1] + " & " + favFoods[2] + ".") ;

    }
}

