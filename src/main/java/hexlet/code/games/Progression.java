package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
public class Progression {
    private static final int LIMIT_NUMBERS = 100;
    private static final int LIMIT_STEP_PROGRESSION = 20;
    private static final int MIN_LENGTH_PROGRESSION = 5;
    private static final int MAX_LENGTH_PROGRESSION = 10;
    public static String[] getProgression(int firstElement, int length, int step) {
        String[] progression = new String[length];
        int elementsProgression = firstElement;
        for (var i = 0; i < progression.length; i++) {
            progression[i] = Integer.toString(elementsProgression);
            elementsProgression += step;
        }
        return progression;
    }
    public static void startGame() {
        String task = "What number is missing in the progression?";
        String[][] questionAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstElement = Utils.generateRandomNumber(LIMIT_NUMBERS);
            int stepProgression = Utils.generateRandomNumberRange(1, LIMIT_STEP_PROGRESSION);
            int lengthProgression = Utils.generateRandomNumberRange(MIN_LENGTH_PROGRESSION, MAX_LENGTH_PROGRESSION);
            int missingIndex = Utils.generateRandomNumberRange(0, lengthProgression);
            String[] progression = getProgression(firstElement, lengthProgression, stepProgression);
            String missingNumber = progression[missingIndex];
            progression[missingIndex] = "..";
            String question = String.join(" ", progression);
            questionAnswers[i][0] = question;
            questionAnswers[i][1] = missingNumber;
        }
        Engine.startGame(task, questionAnswers);
    }
}
