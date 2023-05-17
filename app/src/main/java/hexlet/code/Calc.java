package hexlet.code;
import java.util.Random;
import static hexlet.code.Engine.Total_rounds;
import static hexlet.code.Random.RandomNumber;
public class Calc {
    static final int qa = 2;
    private final static String gameAnswer = "What is the result of the expression?";
    public static void calcGame() {
        String[][] questionsAndAnswers = new String[Total_rounds][qa];
        Random random = new Random();
        for (int i = 0; i < Total_rounds; i++) {
            for (int j = 0; j < qa; j++) {
                int operatorChoice = random.nextInt(3);
                String operator = null;
                int operandOne = RandomNumber();
                int operandTwo = RandomNumber();
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
                }

                    String question = operandOne + operator + operandTwo;
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
        Engine.GameEngine(gameAnswer, questionsAndAnswers);
            }
        }

