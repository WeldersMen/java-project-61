package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
public class Even {
    private static final String GAME_ANSWER = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static boolean evenNumbered(int number) {
        return (number % 2 == 0) ? true : false;
    }
    public static void evenGame() {
        String[][] questionsAndAnswers =  new String[TOTAL_ROUNDS][ARRAY_SIZE];
        for (int i = 0; i <  TOTAL_ROUNDS; i++) {
            int question = generateNumber(0, HUNDRED);
            questionsAndAnswers[i][0] = String.valueOf(question);
            questionsAndAnswers[i][1] = (evenNumbered(question)) ? "yes" : "no";
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}
