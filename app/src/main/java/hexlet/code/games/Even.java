package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
public class Even {
    private static final String GAME_ANSWER = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static boolean isevenNumbered(int number) {
        return (number % 2 == 0) ? true : false;
    }
    public static void evenGame() {
        String[][] questionsAndAnswers =  new String[TOTAL_ROUNDS][ARRAY_SIZE];
        for (String[] array : questionsAndAnswers) {
            int question = generateNumber(0, HUNDRED);
            array[0] = String.valueOf(question);
            array[1] = (isevenNumbered(question)) ? "yes" : "no";
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}
