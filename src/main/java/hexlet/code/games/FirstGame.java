package hexlet.code.games;

import hexlet.code.Engine;

public class FirstGame {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String inputName = Engine.getName();
        System.out.println("Hello, " + inputName + "!");
        return inputName;
    }
}
