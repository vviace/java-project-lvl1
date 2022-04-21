package hexlet.code;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        int numberOfGames = 3;
        System.out.println("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 5 - Progression"
                + "\n 0 - Exit");
        int outNumber = Engine.getNumber();
        System.out.println("Your choice: " + outNumber);

        if (outNumber == 1) {
            FirstGame.greeting();
        }

        if (outNumber == 2) {
            SecondGame.even(numberOfGames);
        }

        if (outNumber == 3) {
            ThirdGame.calc(numberOfGames);
        }
        if (outNumber == 4) {
            FourthGame.gcd(numberOfGames);
        }
        if (outNumber == 5) {
            FifthGame.progression(numberOfGames);
        }
    }
}
