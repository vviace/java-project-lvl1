package hexlet.code;

import hexlet.code.games.FirstGame;
import hexlet.code.games.FourthGame;
import hexlet.code.games.SecondGame;
import hexlet.code.games.ThirdGame;

public class App {
    public static void main(String[] args) {
        int numberOfGames = 3;
        System.out.println("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 0 - Exit");
        int outNumber = Engine.getNumber();
        System.out.println("Your choice: " + outNumber);

        if (outNumber == 1) {
            FirstGame.firstGame();
        }

        if (outNumber == 2) {
            SecondGame.secondGame(numberOfGames);
        }

        if (outNumber == 3) {
            ThirdGame.thirdGame(numberOfGames);
        }
        if (outNumber == 4) {
            FourthGame.fourthGame(numberOfGames);
        }
    }
}
