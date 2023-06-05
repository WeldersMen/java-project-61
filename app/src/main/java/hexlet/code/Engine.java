package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int TOTAL_ROUNDS = 3;
    public static final int ARRAY_SIZE = 2;
    public static void gameEngine(String gameAnswer, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!" + "\nMay I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameAnswer);
        for (String[] array : questionsAndAnswers) {
            String question = array[0];
            String answer =  array[1];
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
        System.out.println("Congratulations, " + name + "!");
    }
}
