package hexlet.code.games;

import hexlet.code.Engine;

public class FourthGame {
    public static void gcd(int numberOfGames) {
        String userName = FirstGame.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int answerCount = 0;

        while (answerCount <= numberOfGames - 1) {
            final int maxNumberBound = 100;
            int randomNumber1 = Engine.getRandomNumber(maxNumberBound);
            int randomNumber2 = Engine.getRandomNumber(maxNumberBound);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
            System.out.println("Your answer: ");
            var userNumber = Engine.getNumber();
            int correctAnswer = Engine.getGcdByEuclidsAlgorithm(randomNumber1, randomNumber2);

            if (userNumber == correctAnswer) {
                System.out.println("Correct!");
                answerCount++;
            } else {
                System.out.println(userNumber
                        + " is wrong answer ;(. Correct answer was "
                        + correctAnswer
                        + ".\nLet's try again, " + userName);
                answerCount -= answerCount;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
