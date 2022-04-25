package hexlet.code.games;

import hexlet.code.Engine;

public class SecondGame {
    public static void even(int numberOfGames) {
        String userName = FirstGame.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answerCount = 0;
        while (answerCount <= numberOfGames - 1) {
            final int maxNumberBound = 100;
            int randomNumber = Engine.getRandomNumber(maxNumberBound);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            var userMessage = Engine.getMessage();
            String correctAnswer;
            if (randomNumber % 2 == 0) {
                correctAnswer = "yes";

            } else {
                correctAnswer = "no";
            }
            if (userMessage.equals(correctAnswer)) {
                System.out.println("Correct!");
                answerCount++;
                if (answerCount == numberOfGames) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println(userMessage + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + ".\nLet's try again, " + userName + "!");
                break;
            }
        }
    }
}
