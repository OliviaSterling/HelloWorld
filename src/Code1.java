import java.util.Scanner;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {
        System.out.println("The");
        System.out.println("\t Cake");
        System.out.print("Is\t\t\t");
        System.out.println("A");
        System.out.println("\t Lie");
        First();
        System.out.println("\n\n");
        Data_types();
        System.out.println("\n\n");
        String();
        ImplicitTypeCasting();
        ExplicitTypeCasting();
        DivisionTypeCasting();
        scannerquestion();

    }
    public static void First (){
        System.out.print ("SHOPPING LIST \n\t- Milk \n\t\t > Semi-skimmed \n\t\t > Medium \n\t- Eggs \n\t\t > Free-range \n\t- Bread");

    }
    public static void Data_types (){
        double x = 7.5;
        byte   y = 10;
        System.out.println(y-x);
    }

    public static void String (){
        String e = "Jeff";
        System.out.print("My" + " " + "name" + " " + "is" + " " + e + "\n\n\n");
    }

    public static void ImplicitTypeCasting (){
        int foo1 = 5;
        double bar = foo1;
        System.out.println(foo1);
        System.out.print(bar);
        System.out.print("\n\n");
    }

    public static void ExplicitTypeCasting (){
        double foo2 = 2.95;
        int    bar2 = (int) foo2;
        System.out.println(foo2);
        System.out.println(bar2);
        System.out.print("\n\n");
    }

    public static void DivisionTypeCasting (){
        int number1 = 17;
        int number2 = 4;
        System.out.println(((double) number1) / number2);
        System.out.println("\n\n");
    }
    public static void Scannerinput () {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        System.out.println(input);
    }
    public static void scannerquestion (){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner1.next ();
        System.out.println(name + " is a nice name\n\n");

        System.out.println("How old are you " + name + "?");
        String age = scanner1.next();
        System.out.println("\nOk so you are " + age + " years old " + name);

        System.out.println("How tall are you in metres?");
        double userHeight = scanner1.nextDouble();
        System.out.println("You are " + userHeight + " metres tall ");

        double averageMaleHeightDifference   = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.68;
        System.out.print("\nThe difference between your height and the average is ");
        System.out.format("%.2f m if you are male.\n", averageMaleHeightDifference);
        System.out.format("%.2f m if your are female.", averageFemaleHeightDifference);
    }

}