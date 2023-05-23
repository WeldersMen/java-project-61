package hexlet.code;
import java.util.Random;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Random.randomNumber;
public class Progression {
    private static final  String GAME_ANSWER = "What number is missing in the progression?";
    public static void progressionGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE]; // массив вопросов и ответов
        Random random = new Random();
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
             //
                int progressionLength = random.nextInt(6) + 5; // Длинна прогрессии от 5 до 10
                int beginProgression = randomNumber(); // Первый элемент прогрессии от 1 до 100
                int progressionDifference = random.nextInt(10) + 1; // Разность прогрессии от 1 до 10
                int hiddenEelement = random.nextInt(progressionLength); //индекс элемента который нужно спрятать
             //
                String question =  "";
                for (int z = 0; z < progressionLength; z++) {
                    if (z == hiddenEelement) {
                        question = question + ".. ";
                    } else {
                        int element = beginProgression + z * progressionDifference;
                        question = question + String.valueOf(element) + " ";
                    }
                }
                String answer = String.valueOf(beginProgression + progressionDifference * hiddenEelement);
                questionsAndAnswers[i][0] = question;
                questionsAndAnswers[i][1] = answer;
            }
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}

