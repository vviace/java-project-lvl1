package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static String getName() {
        Scanner scanName = new Scanner(System.in);
        String userName = scanName.nextLine();
        return userName;
    }
    public static String getMessage() {
        Scanner scanText = new Scanner(System.in);
        String userAnswer = scanText.nextLine();
        return userAnswer;
    }
    public static int getNumber() {
        Scanner scanNumber = new Scanner(System.in);
        int userNumber = scanNumber.nextInt();
        return userNumber;
    }
    public static int randomNumber(int maximumNumber) {
        Random random = new Random();
        int randomNumber = random.nextInt(maximumNumber);
        return randomNumber;
    }

    public static char randomOperator () {
        char[] operatorArray = new char[] {'+', '-', '*'};
        Random random = new Random();
        int indexArray = random.nextInt(operatorArray.length);
        return operatorArray[indexArray];

    }
}
