package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter." +
                "\n 1 - Greet" +
                "\n 2 - Even" +
                "\n 0 - Exit");
        Scanner scanGame = new Scanner(System.in);
        int gameChoice = scanGame.nextInt();
        System.out.println("Your choice: " + gameChoice);

        if (gameChoice == 1) {
            Cli.startDialog();
        }

        if (gameChoice == 2) {
            Cli.even();
        }
    }
}
