package hexlet.code.games;

import hexlet.code.Engine;

public class SixthGame {
    public static void prime(int numberOfGames) {
        String userName = FirstGame.greeting();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");

        int answerCount = 0;
        while (answerCount <= numberOfGames - 1) {
            final int maxNumberBound = 100;
            int randomNumber = Engine.getRandomNumber(maxNumberBound);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            var userMessage = Engine.getMessage();
            String correctAnswer = "";
            boolean correct = Engine.checkPrime(randomNumber);

            if (correct) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (userMessage.equals(correctAnswer)) {
                System.out.println("Correct!");
                answerCount++;
            } else {
                System.out.println(userMessage
                        + " is wrong answer ;(. Correct answer was "
                        + correctAnswer
                        + ". Let's try again, " + userName);
                answerCount -= answerCount;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
