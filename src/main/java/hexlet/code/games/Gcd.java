package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int LIMIT_NUMBERS = 100;
    public static int getGcdByEuclidAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcdByEuclidAlgorithm(n2, n1 % n2);
    }
    public static void startGame() {
        String task = "Find the greatest common divisor of given numbers.";
        String[][] questionAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = Utils.generateRandomNumber(LIMIT_NUMBERS);
            int randomNumber2 = Utils.generateRandomNumber(LIMIT_NUMBERS);
            String question = "" + randomNumber1 + " " + randomNumber2;
            questionAnswers[i][0] = question;
            int result = getGcdByEuclidAlgorithm(randomNumber1, randomNumber2);
            questionAnswers[i][1] = Integer.toString(result);
        }
        Engine.startGame(task, questionAnswers);
    }
}
