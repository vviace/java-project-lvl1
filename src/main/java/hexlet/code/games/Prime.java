package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    private static final int LIMITNUMBERS = 500;
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

    public static void sixthGame() {
        String task = "\nAnswer 'yes' if the number is prime, otherwise answer 'no'.";
        Random random = new Random();
        StringBuilder questions = new StringBuilder();
        String correctAnswer = "";
        StringBuilder correctAnswers = new StringBuilder();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = random.nextInt(LIMITNUMBERS);
            questions.append(randomNumber).append(",");
            if (isPrime(randomNumber)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            correctAnswers.append(correctAnswer).append(",");
        }
        Engine.startGame(task, questions.toString(), correctAnswers.toString());
    }
}
