package HW2;

import java.util.Scanner;

public class Greeting {
    private String enteredName;

    public void askName(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name");
        this.enteredName = userInput.nextLine();
        checkName(this.enteredName);
    }
    public void checkName(String enteredName){
        boolean checkEnteredName = true;
        label:
        while(checkEnteredName){
            switch (this.enteredName) {
                case "Alice":
                    System.out.println("Greetings Alice");
                    break label;
                case "alice":
                    System.out.println("Greetings Alice");
                    break label;
                case "bob":
                    System.out.println("Greetings Bob");
                    break label;
                case "Bob":
                    System.out.println("Greetings Bob");
                    break label;
                default:
                    askName();
                    break label;
            }
        }
    }
}
