package hexlet.code;

public class Cli {
    public static void startDialog() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String inputName = Engine.getMessage();
        System.out.println("Hello, " + inputName + "!");
    }

    public static void even() {
//        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
//        Scanner scanName = new Scanner(System.in);
//        String inputName = scanName.nextLine();
//        System.out.println("Hello, " + inputName + "!");

//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        int rightCount = 0;
//        int numberCycle = 100;
//        for (var i = 0; i < numberCycle; i++) {
//           // int rightAnswer = 3;
//            if (rightCount == 3) {
//                System.out.println("Congratulations, " + inputName + "!");
//                break;
//            }
//
//            Random random = new Random();
//            int maximum = 100;
//            int randomNumber = random.nextInt(maximum);
//
//            System.out.println("Question: " + randomNumber);
//            Scanner scanAnswer = new Scanner(System.in);
//            System.out.println("Your answer: ");
//            String answer = scanAnswer.next();
//
//            if (answer.equals("yes") & randomNumber % 2 == 0) {
//                System.out.println("Correct!");
//                rightCount++;
//            } else if (answer.equals("yes") & randomNumber % 2 != 0) {
//                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
//                        + "Let's try again, " + inputName);
//                if (rightCount > 0) {
//                    rightCount -= rightCount;
//                }
//            } else if (answer.equals("no") & randomNumber % 2 == 0) {
//                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
//                        + "Let's try again, " + inputName);
//                if (rightCount > 0) {
//                    rightCount -= rightCount;
//                }
//            } else if (answer.equals("no") & randomNumber % 2 != 0) {
//                System.out.println("Correct!");
//                rightCount++;
//            } else {
//                if (randomNumber % 2 != 0) {
//                    String correctAnswer = "'no'";
//                    System.out.println("'" + answer + "' is wrong answer :(. Correct answer was "
//                            + correctAnswer + ".\n Let's try again, " + inputName);
//                    rightCount -= rightCount;
//                } else {
//                    String correctAnswer = "'yes'";
//                    System.out.println("'" + answer + "' is wrong answer :(. Correct answer was "
//                            + correctAnswer + ".\n Let's try again, " + inputName);
//                    rightCount -= rightCount;
//                }
//            }
//        }

    }
//    public static void calc() {
//        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
//        Scanner scanName = new Scanner(System.in);
//        String inputName = scanName.nextLine();
//        System.out.println("Hello, " + inputName + "!");
//        System.out.println("What is the result of the expression?");
//        int numberCycle = 100;
//        for (var i = 0; i < numberCycle; i++) {
//            Random random = new Random();
//            int maximum = 100;
//            int randomNumberFirst = random.nextInt(maximum);
//            int randomNumberSecond = random.nextInt(maximum);
//            String[] operator = new String[]{"*", "+", "-"};
//            int randomIndexOp = random.nextInt(operator.length);
//            System.out.println("Question: " + randomNumberFirst + " " + operator[randomIndexOp] + " " + randomNumberSecond);
//        }
//    }

}

