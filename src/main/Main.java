package main;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();

        for (int i = 0; i < 5; i++) {
            inputHandler.addNewEmployee();
        }
        inputHandler.ask();
    }
}