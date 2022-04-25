package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int getGcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcdByEuclidsAlgorithm(n2, n1 % n2);
    }
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
    public static int getRandomNumber(int bound) {
        Random random = new Random();
        int randomNumber = random.nextInt(bound);
        return randomNumber;
    }

    public static char getRandomOperator() {
        char[] operatorArray = new char[] {'+', '-', '*'};
        Random random = new Random();
        int indexArray = random.nextInt(operatorArray.length);
        return operatorArray[indexArray];
    }
    public static char getOperator() {
        char[] operatorArray = new char[] {'+', '-'};
        Random random = new Random();
        int indexArray = random.nextInt(operatorArray.length);
        return operatorArray[indexArray];
    }
    public static boolean checkPrime(int randomNumber) {
        boolean answer = true;
        for (int i = 2; i < Math.sqrt(randomNumber); i++) {
            var number = randomNumber % i;
            if (number == 0) {
                answer = false;
                break;
            }
        }
        if (randomNumber == 0 || randomNumber == 1) {
            answer = false;
        }
        return answer;
    }
}
