package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        int gameChoice = scanner.nextInt();
        switch (gameChoice) {
            case 1 -> Greet.echoGreet();
            case 2 -> Even.evenGame();
            case 3 -> Calc.calcGame();
            case 4 -> GCD.gcdGame();
            case 0 -> {
            }
            default -> System.out.println("Такой игры нет в списке.");

        }

    }
}
