package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Gcd {
    public static int getGcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static void gcdGame() {
        String userName = Cli.startDialog();
        String state = "Find the greatest common divisor of given numbers.";
        System.out.println(state);

        boolean game = true;
        int answerCount = 0;
        while (game) {
            answerCount++;
            Random random = new Random();
            final int limitValue = 100;
            int randomNumber1 = random.nextInt(limitValue);
            int randomNumber2 = random.nextInt(limitValue);

            String question = "" + randomNumber1  + " " + randomNumber2;
            int result = getGcdByEuclidsAlgorithm(randomNumber1, randomNumber2);
            String correctAnswer = "" + result;
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }
    }
}
