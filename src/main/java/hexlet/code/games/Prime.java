package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    private static final int LIMIT_NUMBERS = 500;
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void startGame() {
        String task = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
        String[][] questionAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.generateRandomNumber(LIMIT_NUMBERS);
            questionAnswers[i][0] = Integer.toString(randomNumber);
            questionAnswers[i][1] = (isPrime(randomNumber)) ? "yes" : "no";
        }
        Engine.startGame(task, questionAnswers);
    }
}
