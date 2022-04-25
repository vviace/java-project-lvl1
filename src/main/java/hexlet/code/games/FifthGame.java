package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Arrays;

public class FifthGame {
    public static void progression(int numberOfGames) {
        String userName = FirstGame.greeting();
        System.out.println("What number is missing in the progression?");
        int answerCount = 0;

        while (answerCount <= numberOfGames - 1) {
            final int maxNumberBound = 100;
            int firstElement = Engine.getRandomNumber(maxNumberBound);
            int operator = Engine.getRandomOperator();
            Random random = new Random();
            final int maxProgressionBound = 10;
            int progressionValue = random.nextInt(1, maxProgressionBound);
            final int maxArrayBound = 10;
            final int minArrayBound = 5;
            int lengthArray = random.nextInt(minArrayBound, maxArrayBound);
            int[] progression = new int[lengthArray];
            int replaceIndex = random.nextInt(0, lengthArray);
            progression[0] = firstElement;
            for (var i = 0; i < progression.length - 1; i++) {
                if (operator == '*') {
                    int multiply = progression[i] * progressionValue;
                    progression[i + 1] = multiply;
                }
                if (operator == '+') {
                    int sum = progression[i] + progressionValue;
                    progression[i + 1] = sum;
                }
                if (operator == '-') {
                    int subtraction = progression[i] - progressionValue;
                    progression[i + 1] = subtraction;
                }
            }
            int correctAnswer = progression[replaceIndex];
            var result = Arrays.copyOfRange(progression, 0, replaceIndex);
            var result2 = Arrays.copyOfRange(progression, replaceIndex + 1, lengthArray);
            String progressionFirst = Arrays.toString(result).replaceAll(",", "");
            String progressionSecond = Arrays.toString(result2).replaceAll(",", "");

            System.out.println("Question: "
                    + progressionFirst.substring(1, progressionFirst.length() - 1)
                    + " .. "
                    + progressionSecond.substring(1, progressionSecond.length() - 1));
            System.out.println("Your answer: ");
            var userNumber = Engine.getNumber();

            if (userNumber == correctAnswer) {
                System.out.println("Correct!");
                answerCount++;
                if (answerCount == numberOfGames) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println(userNumber
                        + " is wrong answer ;(. Correct answer was "
                        + correctAnswer
                        + ".\nLet's try again, " + userName + "!");
                break;
            }
        }
    }
}
