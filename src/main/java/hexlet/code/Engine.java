package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int ROUNDS = 3;

    public static void startGame(String description, String[][] questionsAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAnswers[i][0]);
            String userAnswer = scanner.next();
            if (userAnswer.equals(questionsAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + questionsAnswers[i][1]
                        + ".\nLet's try again, " + userName + "!");
                return;
            }

        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
