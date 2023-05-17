package hexlet.code;


import java.util.Scanner;

public class Engine {
   public static final int Total_rounds = 3;
    public static void GameEngine (String gameAnswer, String [][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameAnswer);
        for (int i = 0; i < Total_rounds; i++) {
            String question = questionsAndAnswers[i][0];
            String answer =  questionsAndAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answer
                        + "'.\nLet's try again, " + name + "!");
                return;
            }

        }




    }
}
