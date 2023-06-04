package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ARRAY_SIZE;
import static hexlet.code.Engine.TOTAL_ROUNDS;
import static hexlet.code.Utils.HUNDRED;
import static hexlet.code.Utils.generateNumber;
public class Calc {
    private static final  String GAME_ANSWER = "What is the result of the expression?";
    public static void calcGame() {
        String[][] questionsAndAnswers = new String[TOTAL_ROUNDS][ARRAY_SIZE];
        String[] arrOperator = new String[]{"+", "-", "*"}; // инициализация массива с операторами
        Random random = new Random();
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            int operatorChoice = generateNumber(0, 2); // Рандомный индекс для массива операторов
            String operator = arrOperator[operatorChoice]; // инициализация рандомного оператора
            int operandOne = generateNumber(0, HUNDRED);
            int operandTwo = generateNumber(0, HUNDRED);
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
                    throw new RuntimeException("Unknown input: " + operator);
            }
        }
        Engine.gameEngine(GAME_ANSWER, questionsAndAnswers);
    }
}

