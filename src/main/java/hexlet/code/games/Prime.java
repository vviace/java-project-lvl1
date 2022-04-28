package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    static boolean isPrime(int number)
    {
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

    public static void primeGame() {
        String userName = Cli.startDialog();
        String state = "\nAnswer 'yes' if the number is prime, otherwise answer 'no'.";
        System.out.println(state);
        boolean game = true;
        int answerCount = 0;
        while (game) {
            answerCount++;
            Random random = new Random();
            final int limitValue = 500;
            int randomNumber1 = random.nextInt(limitValue);
            String question = "" + randomNumber1;
            String correctAnswer = "";
            if (isPrime(randomNumber1)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }
    }
}
