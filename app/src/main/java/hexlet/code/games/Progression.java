package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
public class Progression {
    private static final  String GAME_ANSWER = "What number is missing in the progression?";
    private static final int ONE = 1;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int TEN = 10;
    public static String[] makeProgression(int first, int step, int length) {
        String[] progression =  new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(first + i * step);
        }
        return progression;
    }
    public static void progressionGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE]; // массив вопросов и ответов
        Random random = new Random();
        for (String[] array : questionsAndAnswers) {
             //
            int firstProgression = generateNumber(0, HUNDRED); // Первый элемент прогрессии от 1 до 100
            int lenghtProgression = generateNumber(FIVE, TEN); // Длинна прогрессии от 5 до 10
            int stepProgresson = generateNumber(ONE, TEN); // Разность прогрессии от 1 до 10
            int hiddenEelement = generateNumber(0, lenghtProgression - 1); //индекс элемента который нужно спрятать
             //
            String[] progression = makeProgression(firstProgression, stepProgresson, lenghtProgression);
            var answer = progression[hiddenEelement];
            progression[hiddenEelement] = "..";
            var question = String.join(" ", progression);
            array[0] = question;
            array[1] = answer;

        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);

    }
}

