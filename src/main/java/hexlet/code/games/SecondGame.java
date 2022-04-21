package hexlet.code.games;

import hexlet.code.Engine;

public class SecondGame {
    public static void even (int numberOfGames) {
        String userName = FirstGame.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int answerCount = 0;
        while (answerCount <= numberOfGames-1) {

            int randomNumber = Engine.randomNumber(100);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            var userMessage = Engine.getMessage();
            String correctAnswer;
            if (randomNumber % 2 == 0 ) {
                correctAnswer = "yes";

            } else {
                correctAnswer = "no";
            }
            if (userMessage.equals(correctAnswer)) {
                System.out.println("Correct!");
                answerCount++;
            } else {
                System.out.println(userMessage + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + ". Let's try again, " + userName);
                answerCount -= answerCount;
            }
        }
        System.out.println("Congratulations, " + userName +"!");
    }
}
