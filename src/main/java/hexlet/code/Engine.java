package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static boolean startGame(String question, String correctAnswer, String userName, int answerCount) {
        final int numberOfGames = 3;
        System.out.println("Question: " + question);
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.next();
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            if (answerCount == numberOfGames) {
                System.out.println("Congratulations, " + userName + "!");
                return false;
            }
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                    + correctAnswer
                    + ".\nLet's try again, " + userName + "!");
            return false;
        }
        return true;
    }
}
