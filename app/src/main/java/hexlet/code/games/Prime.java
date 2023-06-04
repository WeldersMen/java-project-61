package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
public class Prime {
    private static final  String GAME_ANSWER = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE]; // массив вопросов и ответов
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int question = generateNumber(0, HUNDRED);
            boolean answer = isPrime(question);
            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = answer ? "yes" : "no";
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}

