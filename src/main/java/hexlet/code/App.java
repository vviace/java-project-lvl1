package hexlet.code;

import hexlet.code.games.FirstGame;
import hexlet.code.games.SecondGame;
import hexlet.code.games.ThirdGame;
import hexlet.code.games.FourthGame;
import hexlet.code.games.FifthGame;
import hexlet.code.games.SixthGame;

public class App {
    public static void main(String[] args) {
        final int numberOfGames = 3;
        System.out.println("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 5 - Progression"
                + "\n 6 - Prime"
                + "\n 0 - Exit");
        int outNumber = Engine.getNumber();
        System.out.println("Your choice: " + outNumber);
        final int greetGame = 1;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;

        if (outNumber == greetGame) {
            FirstGame.greeting();
        }

        if (outNumber == evenGame) {
            SecondGame.even(numberOfGames);
        }

        if (outNumber == calcGame) {
            ThirdGame.calc(numberOfGames);
        }

        if (outNumber == gcdGame) {
            FourthGame.gcd(numberOfGames);
        }

        if (outNumber == progressionGame) {
            FifthGame.progression(numberOfGames);
        }

        if (outNumber == primeGame) {
            SixthGame.prime(numberOfGames);
        }
    }
}
