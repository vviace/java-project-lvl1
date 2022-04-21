package hexlet.code.games;

import hexlet.code.Engine;

public class ThirdGame {
    public static void thirdGame(int numberOfGames) {
        String userName = FirstGame.firstGame();
        System.out.println("What is the result of the expression?");
        int answerCount = 0;
        while (answerCount <= numberOfGames-1) {
            int randomNumber1 = Engine.randomNumber(100);
            int randomNumber2 = Engine.randomNumber(100);
            char operator = Engine.randomOperator();
            System.out.println("Question: " + randomNumber1 + " " + operator + " " + randomNumber2);
            System.out.println("Your answer: ");
            var userNumber = Engine.getNumber();
            int correctAnswer = 0;

            if (operator == '*') {
                int multiply = randomNumber1 * randomNumber2;
                correctAnswer = multiply;
            }
            if (operator == '+') {
                int sum = randomNumber1 + randomNumber2;
                correctAnswer = sum;
            }
            if (operator == '-') {
                int subtraction = randomNumber1 - randomNumber2;
                correctAnswer = subtraction;
            }

            if (userNumber == correctAnswer) {
                System.out.println("Correct!");
                answerCount++;
            } else {
                System.out.println(userNumber + " is wrong answer ;(. Correct answer was " + correctAnswer
                        + ". Let's try again, " + userName);
                answerCount -= answerCount;
            }
        }
        System.out.println("Congratulations, " + userName +"!");
    }
}