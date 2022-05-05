package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int LIMITNUMBERS = 100;
    public static void secondGame() {
        String task = "Answer 'yes' if number even otherwise answer 'no'.?";
        Random random = new Random();
        StringBuilder questions = new StringBuilder();
        StringBuilder correctAnswers = new StringBuilder();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = random.nextInt(LIMITNUMBERS);
            String number = Integer.toString(randomNumber);
            questions.append(number).append(",");
            if (randomNumber % 2 == 0) {
                correctAnswers.append("yes" + ",");
            } else {
                correctAnswers.append("no" + ",");
            }
        }
        Engine.startGame(task, questions.toString(), correctAnswers.toString());
    }
}
