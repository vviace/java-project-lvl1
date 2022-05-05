package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class Progression {
    private static final int LIMITNUMBERS = 100;
    private static final int LIMITWEIGHTPROGRESSION = 20;
    private static final int MINLENGHTPROGRESSION = 5;
    private static final int MAXLENGHTPROGRESSION = 10;
    public static String[] getProgression(int length) {
        Random random = new Random();
        int randomNumber = random.nextInt(LIMITNUMBERS);
        int weightProgression = random.nextInt(1, LIMITWEIGHTPROGRESSION);
        String[] progression = new String[length];
        int elementsProgression = randomNumber;
        for (var i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(elementsProgression);
            elementsProgression += weightProgression;
        }
        return progression;
    }
    public static void fifthGame() {
        String task = "What number is missing in the progression?";
        StringBuilder questions = new StringBuilder();
        StringBuilder correctAnswers = new StringBuilder();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            Random random = new Random();
            int randomLength = random.nextInt(MINLENGHTPROGRESSION, MAXLENGHTPROGRESSION);
            int missingIndex = random.nextInt(0, randomLength);
            String[] progression = getProgression(randomLength);
            String missingNumber = progression[missingIndex];
            progression[missingIndex] = "..";
            String question = String.join(" ", progression);
            questions.append(question).append(",");
            String correctAnswer = "" + missingNumber;
            correctAnswers.append(correctAnswer).append(",");
        }
        Engine.startGame(task, questions.toString(), correctAnswers.toString());
    }
}
