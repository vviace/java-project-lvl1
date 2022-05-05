package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Gcd {
    private static final int LIMITNUMBERS = 100;
    public static int getGcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcdByEuclidsAlgorithm(n2, n1 % n2);
    }
    public static void fourthGame() {
        String task = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        StringBuilder questions = new StringBuilder();
        StringBuilder correctAnswers = new StringBuilder();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber1 = random.nextInt(LIMITNUMBERS);
            int randomNumber2 = random.nextInt(LIMITNUMBERS);
            String question = "" + randomNumber1 + " " + randomNumber2;
            questions.append(question).append(",");
            int result = getGcdByEuclidsAlgorithm(randomNumber1, randomNumber2);
            correctAnswers.append(result).append(",");
        }
        Engine.startGame(task, questions.toString(), correctAnswers.toString());
    }
}
