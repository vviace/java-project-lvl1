package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calculation;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter."
                + "\n 1 - Greet"
                + "\n 2 - Even"
                + "\n 3 - Calc"
                + "\n 4 - GCD"
                + "\n 5 - Progression"
                + "\n 6 - Prime"
                + "\n 0 - Exit");
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.next();
        System.out.println("Your choice: " + userChoice);

        switch (userChoice) {
            case("1"): Cli.startGame();
                break;
            case("2"): Even.startGame();
                break;
            case("3"): Calculation.startGame();
                break;
            case("4"): Gcd.startGame();
                break;
            case("5"): Progression.startGame();
                break;
            case("6"): Prime.startGame();
                break;
            case("0"):
                break;
            default:
                throw new RuntimeException("Enter number of game!");
        }
    }
}
