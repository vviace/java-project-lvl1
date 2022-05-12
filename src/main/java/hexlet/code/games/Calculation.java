package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculation {
    private static final int LIMIT_NUMBERS = 100;
    private static final char[] OPERATORS = new char[] {'+', '-', '*'};

    public static void startGame() {

        String task = "What is the result of the expression?";
        String correctAnswer = "";
        String[][] questionAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = Utils.generateRandomNumber(LIMIT_NUMBERS);
            int randomNumber2 = Utils.generateRandomNumber(LIMIT_NUMBERS);
            int procedureIndex = Utils.generateRandomNumber(OPERATORS.length);
            String question = "" + randomNumber1 + " " + OPERATORS[procedureIndex] + " " + randomNumber2;
            questionAnswers[i][0] = question;
            switch (OPERATORS[procedureIndex]) {
                case ('+'):
                    correctAnswer = Integer.toString(randomNumber1 + randomNumber2);
                    break;
                case ('-'):
                    correctAnswer = Integer.toString(randomNumber1 - randomNumber2);
                    break;
                case ('*'):
                    correctAnswer = Integer.toString(randomNumber1 * randomNumber2);
                    break;
                default:
                    break;
            }
            questionAnswers[i][1] = correctAnswer;
        }
        Engine.startGame(task, questionAnswers);
    }
}
