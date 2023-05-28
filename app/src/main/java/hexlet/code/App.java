package hexlet.code;
import java.util.Scanner;
public class App {
    static final int ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, ZERO = 0;

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
