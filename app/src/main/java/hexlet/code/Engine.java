package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int TOTAL_ROUNDS = 3;
    public static final int ARRAY_SIZE = 2;
    public static void gameEngine(String gameAnswer, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameAnswer);
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
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
