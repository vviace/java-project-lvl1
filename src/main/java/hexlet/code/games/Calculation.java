package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Calculation {
    private static final int LIMITNUMBERS = 100;
    private static final char PLUS = '+';
    private static final char MINUS = '-';
    private static final char MULTIPLY = '*';
    private static final char[] PROCEDURE = new char[] {PLUS, MINUS, MULTIPLY};
    public static void thirdGame() {

        String task = "What is the result of the expression?";
        Random random = new Random();
        StringBuilder questions = new StringBuilder();
        String correctAnswer = "";
        StringBuilder correctAnswers = new StringBuilder();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = random.nextInt(LIMITNUMBERS);
            int randomNumber2 = random.nextInt(LIMITNUMBERS);
            int procedureIndex = random.nextInt(PROCEDURE.length);
            String question = "" + randomNumber1 + " " + PROCEDURE[procedureIndex] + " " + randomNumber2;
            questions.append(question).append(",");
            switch (PROCEDURE[procedureIndex]) {
                case (PLUS): correctAnswer = Integer.toString(randomNumber1 + randomNumber2);
                break;
                case (MINUS): correctAnswer = Integer.toString(randomNumber1 - randomNumber2);
                break;
                case(MULTIPLY): correctAnswer = Integer.toString(randomNumber1 * randomNumber2);
                break;
                default:
                    break;
            }
            correctAnswers.append(correctAnswer).append(",");
        }
        Engine.startGame(task, questions.toString(), correctAnswers.toString());
    }
}
