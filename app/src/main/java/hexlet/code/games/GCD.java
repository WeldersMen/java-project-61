package hexlet.code.games;
import hexlet.code.Engine;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
public class GCD {
    private static final String GAME_ANSWER = "Find the greatest common divisor of given numbers.";

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
    public static void gcdGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE];
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int number1 = generateNumber(0, HUNDRED);
            int number2 = generateNumber(0, HUNDRED);
            int gcd = gcd(number1, number2);
            questionsAndAnswers[i][0] = String.valueOf(number1) + " " + String.valueOf(number2);
            questionsAndAnswers[i][1] = String.valueOf(gcd);

        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}

