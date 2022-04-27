package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    public static void progressionGame() {
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
            final int maxProgressionBound = 20;
            int progressionValue = random.nextInt(1, maxProgressionBound);
            final int maxArrayLimit = 10;
            final int minArrayLimit = 5;
            int lengthArray = random.nextInt(minArrayLimit, maxArrayLimit);
            String[] progression = new String[lengthArray];
            int replaceIndex = random.nextInt(0, lengthArray);
            int sum = randomNumber1;
            for (var i = 0; i < progression.length; i++) {
                progression[i] = Integer.toString(sum);
                sum = sum + progressionValue;
            }

            String result = progression[replaceIndex];
            progression[replaceIndex] = "..";

            String question = String.join(" ", progression);
            String correctAnswer = "" + result;
            game = Engine.startGame(question, correctAnswer, userName, answerCount);
        }
    }
}
