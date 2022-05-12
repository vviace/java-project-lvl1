package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int LIMIT_NUMBERS = 100;
    public static void startGame() {
        String task = "Answer 'yes' if number even otherwise answer 'no'.?";
        String[][] questionAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.generateRandomNumber(LIMIT_NUMBERS);
            questionAnswers[i][0] = Integer.toString(randomNumber);
            questionAnswers[i][1] = (randomNumber % 2 == 0) ? "yes" : "no";
        }
        Engine.startGame(task, questionAnswers);
    }
}
