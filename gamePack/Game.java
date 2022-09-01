package gamePack;

import java.util.Random;
import java.util.Scanner;

public class Game extends gameChoices{
    Scanner user_input = new Scanner(System.in);

    public void brainGame(int rounds) {
        int comp = 0;
        int player = 0;

        for (int i = rounds; i >= 1; i--) {

            System.out.println("\nrounds remaining in the game: " + i);

            //getting choices or player and the comp
            String playerChoice = playerChoice();
            String compChoice = selectRandomCompChoice();

            System.out.println("\nYOU: " + playerChoice + " - COMPUTER: " + compChoice);

            //executing the rules/ brain for the game
                if (compChoice.equals("rock") && playerChoice.equals("rock")) {
                    System.out.println("it's a draw, try again");
                    i++;
                } else if (compChoice.equals("rock") && playerChoice.equals("paper")) {
                    System.out.println("You won this round");
                    player++;
                } else if (compChoice.equals("rock") && playerChoice.equals("scissors")) {
                    System.out.println("You lost this round");
                    comp++;
                } else if (compChoice.equals("paper") && playerChoice.equals("paper")) {
                    System.out.println("it's a draw, try again");
                    i++;
                } else if (compChoice.equals("paper") && playerChoice.equals("scissors")) {
                    System.out.println("You won this round");
                    player++;
                } else if (compChoice.equals("paper") && playerChoice.equals("rock")) {
                    System.out.println("You lost this round");
                    comp++;
                } else if (compChoice.equals("scissors") && playerChoice.equals("scissors")) {
                    System.out.println("it's a draw, try again");
                    i++;
                } else if (compChoice.equals("scissors") && playerChoice.equals("paper")) {
                    System.out.println("You lost this round");
                    comp++;
                } else if (compChoice.equals("scissors") && playerChoice.equals("rock")) {
                    System.out.println("You won this round");
                    player++;
                }
            System.out.println("\nSCORE player: " + player + " comp: " + comp);
            }
        printingWinner(comp, player);
        ifPlayAgain("do you want to try again?");
        }

    public void ifPlayAgain(String message) {
        System.out.println(message);
        String tryAgain = user_input.next();

        if (tryAgain.equals("yes")){
            brainGame(roundsInput());
        } else if (tryAgain.equals("no")){
            System.out.println("Thanks for the game, byeoooo!");
        }else {
            System.out.println("enter yes or no");
            tryAgain = user_input.next();
            if (tryAgain.equals("yes")){
                brainGame(roundsInput());
            }
        }
    }

    public void printingWinner(int comp, int player) {
        String winnerMsg = comp > player ? "You lost the game, better luck next time!" :
                comp == player? "it's a draw ":
                        "Congrats You won the game!";
        System.out.println(winnerMsg);
    }


}
class gameChoices extends User{

    public String selectRandomCompChoice(){
        //getting computer's random choice
        final String[] compOptions = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(compOptions.length);
        return compOptions[index];
    }
    public String playerChoice(){
        System.out.println("enter your choice");
        String playerChoice = user_input.next();
        //while loop checking for invalid inputs
        while(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
            System.out.println("Your choice is invalid, please try again");
            playerChoice = user_input.next();
        }
        return playerChoice;
    }
}