package hexlet.code;
import java.util.Random;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Random.randomNumber;
public class Calc {
    private static final  String GAME_ANSWER = "What is the result of the expression?";
    public static void calcGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                int operatorChoice = random.nextInt(3);
                String operator = null;
                int operandOne = randomNumber();
                int operandTwo = randomNumber();
                switch (operatorChoice) {
                    case 0:
                        operator = "+";
                        break;
                    case 1:
                        operator = "-";
                        break;
                    case 2:
                        operator = "*";
                        break;
                    default:
                        operator = null;
                        break;
                }
                String question = operandOne + " " + operator + " " + operandTwo;
                int answer;
                switch (operator) {
                    case "+":
                        answer = operandOne + operandTwo;
                        questionsAndAnswers[i][0] = question;
                        questionsAndAnswers[i][1] = String.valueOf(answer);
                        break;
                    case "-":
                        answer = operandOne - operandTwo;
                        questionsAndAnswers[i][0] = question;
                        questionsAndAnswers[i][1] = String.valueOf(answer);
                        break;
                    case "*":
                        answer = operandOne * operandTwo;
                        questionsAndAnswers[i][0] = question;
                        questionsAndAnswers[i][1] = String.valueOf(answer);
                        break;
                    default:
                        answer = 0;
                        break;
                }
            }
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}

