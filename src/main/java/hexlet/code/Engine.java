package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int ROUNDS = 3;
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void startGame(String state, String questions, String correctAnswer) {
        String userName = greeting();
        System.out.println(state);
        String[] cases = questions.split(",");
        String[] answers = correctAnswer.split(",");
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + cases[i]);
            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.next();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                if (i == ROUNDS - 1) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was "
                        + answers[i]
                        + ".\nLet's try again, " + userName + "!");
                break;
            }

        }
    }
}
