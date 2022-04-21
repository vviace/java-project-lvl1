package hexlet.code;

public class Cli {
    public static void startDialog() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String inputName = Engine.getMessage();
        System.out.println("Hello, " + inputName + "!");
    }

}

