package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void echoGreet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!" + "\nMay I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
