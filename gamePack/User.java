package gamePack;

import java.util.Scanner;

public class User {
    Scanner user_input = new Scanner(System.in);

    private String name;

    public void setName(String message) {
        System.out.println(message);
        this.name = user_input.next();
    }

    public String getName() {
        return name;
    }

    public void setAnswer(String message) {
        System.out.println(message);
        String rulesMessage = "Players start each round by typing, \"rock, paper or scissors\" \nRock crushes scissors, scissors cut paper, and paper covers rock. \nSee who wins each round!";
        String answer = user_input.next();

        if (answer.equals("no") || answer.equals("No")) {
            System.out.println(rulesMessage);
        } else if (answer.equals("yes") || answer.equals("Yes")) {
            System.out.println("Good Luck!");
        } else {
            System.out.println("Please answer yes or no");
            answer = user_input.next();
            if (answer.equals("no") || answer.equals("No")) {
                System.out.println(rulesMessage);
            } else if (answer.equals("yes") || answer.equals("Yes")) {
                System.out.println("Good Luck!");
            } else {
                System.out.println("Fine. Good Luck then.");
            }
        }
    }
    public int roundsInput() {
        System.out.println("how many rounds do you want to play? Please choose odd number of rounds...");
        return user_input.nextInt();
    }
}



