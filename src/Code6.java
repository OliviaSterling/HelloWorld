import java.util.Scanner;

public class Code6 {

    public static void main(String[] args) {
        quiz();
    }

    public static void tast1() {
        // You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
        // The users are teachers who will input each student’s score, and any other necessary data.
        // Store the scores in an array. The program should output:
        //1: Each student’s score and percentage for the exam
        //2: The mean (average) score and percentage of the exam
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students have taken the test?: ");
        int xstudents = scanner.nextInt();

        System.out.println("What is the max test score?: ");
        int maxScore = scanner.nextInt();

        int[] scores = new int[xstudents];
        for (int studentx = 0; studentx < scores.length; studentx++) {
            System.out.println("Type in the score for student " + (studentx + 1) + " please: ");
            scores[studentx] = scanner.nextInt();
        }


        int sum = 0;
        for (double i = 0.0; i < scores.length; i++) {
            double studentScores = scores[(int) i];
            double percentage = (int) ((studentScores / maxScore) * 100);
            System.out.format("Student " + ((int) i + 1) + "'s score is: " + studentScores + " and his/her percentage is: " + percentage + ".");
            System.out.print("% \n");
            sum = (int) (sum + studentScores);
        }

        double avgScore = sum / scores.length;
        double avgPercentage = avgScore / maxScore * 100;
        System.out.format("The average score and percentage of the exam is: " + avgScore + " points and %.1f", avgPercentage);
        System.out.print("%");

    }


    public static void quiz() {
        //Write a quiz program with five true-or-false questions.
        // Display a question to the user, and ask the user to enter either true or false, then move on to the next question.
        // At the end of the quiz display the user’s score.
        //Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean array for the user’s answers.
        Scanner scanner = new Scanner(System.in);

        System.out.println("You will be presented with 5 statements and you will have to guess whether they are \"true\" or \"false\". Good luck!");

        String begin = null;
        do {
            System.out.println("type \"start\" to begin playing:");
            begin = scanner.nextLine();
        } while (!(begin.equals("start")));


        String[] questions = new String[]{
                "Ikea is a Swedish brand.",
                "Red and White mixed together gives you pink.",
                "Women on average live longer than men.",
                "Turkey is located in both Europe and Asia.",
                "Tuvalu is the worlds least visited country."
        };

        boolean[] answer = new boolean[]{
                true,
                true,
                true,
                true,
                true
        };

        boolean[] userAnswer = new boolean[5];

        int scoreCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            userAnswer[i] = scanner.nextBoolean();
            if (userAnswer[i] == answer[i]) {
                scoreCount++;
            }
        }
        if (scoreCount < questions.length) {
            System.out.println("Nice try! You got " + scoreCount + " times.");
        } else {
            System.out.println("Awesome! 5/5");
        }
    }

    public static void guess (){

    }
}
