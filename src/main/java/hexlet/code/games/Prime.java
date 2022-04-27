package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Prime {
    public static boolean checkPrime(int randomNumber) {
        boolean answer = true;
        for (int i = 2; i < Math.sqrt(randomNumber); i++) {
            var number = randomNumber % i;
            if (number == 0) {
                answer = false;
                break;
            }
        }
        if (randomNumber == 0 || randomNumber == 1) {
            answer = false;
        }
        return answer;
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
            final int limitValue = 100;
            int randomNumber1 = random.nextInt(limitValue);
            String question = "" + randomNumber1;
            String correctAnswer = "";
            if (checkPrime(randomNumber1)) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }
    }
}
