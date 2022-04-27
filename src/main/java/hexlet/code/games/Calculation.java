package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Calculation {
    public static void calcGame() {
        String userName = Cli.startDialog();
        String state = "What is the result of the expression?";
        System.out.println(state);

        boolean game = true;
        int answerCount = 0;
        while (game) {
            answerCount++;
            Random random = new Random();
            final int limitValue = 100;
            int randomNumber1 = random.nextInt(limitValue);
            int randomNumber2 = random.nextInt(limitValue);

            char[] operatorArray = new char[] {'+', '-', '*'};
            int indexArray = random.nextInt(operatorArray.length);
            String question = "" + randomNumber1  + " " + operatorArray[indexArray] + " " + randomNumber2;
            int result = 0;
            if (operatorArray[indexArray] == '*') {
                result = randomNumber1 * randomNumber2;
            } else if (operatorArray[indexArray] == '+') {
                result  = randomNumber1 + randomNumber2;
            } else if (operatorArray[indexArray] == '-') {
                result = randomNumber1 - randomNumber2;
            }
            String correctAnswer = "" + result;
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }
    }
}
