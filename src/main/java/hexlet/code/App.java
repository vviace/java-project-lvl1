package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calculation;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

/**
 * class App предназначен для отображения игрового меню, выбора и запуска нужной игры
 */
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
            case("1"): Cli.startDialog();
                break;
            case("2"): Even.secondGame();
                break;
            case("3"): Calculation.thirdGame();
                break;
            case("4"): Gcd.fourthGame();
                break;
            case("5"): Progression.fifthGame();
                break;
            case("6"): Prime.sixthGame();
                break;
            default:
                break;
        }
    }
}
