package hexlet.code.games;
import hexlet.code.Engine;

import static hexlet.code.Random.randomNumber;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;

public class Even {
    private static final String GAME_ANSWER = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        String[][] questionsAndAnswers =  new String[TOTAL_ROUNDS][ARRAY_SIZE];
        for (int i = 0; i <  TOTAL_ROUNDS; i++) {
            int question = randomNumber();
            questionsAndAnswers[i][0] = String.valueOf(question);
            if ((question % 2) == 0) {
                questionsAndAnswers[i][1] = "yes";
            } else {
                questionsAndAnswers[i][1] = "no";
            }
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}
