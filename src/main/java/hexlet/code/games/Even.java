package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Even {
    public static void evenGame() {
        String userName = Cli.startDialog();
        String state = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        System.out.println(state);

        boolean game = true;
        int answerCount = 0;
        while (game) {
            answerCount++;
            Random random = new Random();
            final int limitValue = 100;
            int randomNumber = random.nextInt(limitValue);
            String question = "" + randomNumber;
            String correctAnswer = "";
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }

    }
}
