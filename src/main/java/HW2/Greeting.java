package HW2;

import java.util.Scanner;

public class Greeting {
    private String enteredName;

    public void askName() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name");
        this.enteredName = userInput.nextLine();
        checkName(this.enteredName);
    }

    public void checkName(String enteredName) {
        boolean checkEnteredName = true;
        while (checkEnteredName) {
            if (this.enteredName.equalsIgnoreCase("Alice")) {
                System.out.println("Greetings Alice");
                break;
            } else if (this.enteredName.equalsIgnoreCase("Bob")) {
                System.out.println("Greetings Bob");
                break;
            } else {
                askName();
                break;
            }
        }
    }
}
