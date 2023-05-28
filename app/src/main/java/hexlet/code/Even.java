package hexlet.code;
import java.util.Scanner;
import java.util.Random;
public class Even {
    private static final int THREE = 3, HUNDRED = 100;
    public static void evenGame() {
        Random random = new Random();
        int correctCount = 0;
        int number;
        int answer;
        System.out.println("Your choice: 2\n\nWelcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        while (correctCount < THREE) {
            number = random.nextInt(HUNDRED);
            System.out.print("Answer 'yes' if the number is even, otherwise answer 'no'.\n"
                    + "Question: " + number
                    + "\nYour answer: ");
            String userAnswer = scanner.nextLine();
            answer = number % 2;
            if ((answer == 0 && userAnswer.equals("yes")) || (answer != 0 && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("'"
                        + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + (answer == 0 ? "yes" : "no")
                        + "'.\nLet's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
