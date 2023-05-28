package hexlet.code;
import java.util.Scanner;
public class App {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int ZERO = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        int gameChoice = scanner.nextInt();
        switch (gameChoice) {
            case ONE -> Greet.echoGreet();
            case TWO -> Even.evenGame();
            case THREE -> Calc.calcGame();
            case FOUR -> GCD.gcdGame();
            case FIVE -> Progression.progressionGame();
            case SIX -> Prime.primeGame();
            case ZERO -> {
            }
            default -> System.out.println("Такой игры нет в списке.");

        }

    }
}
