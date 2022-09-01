package gamePack;

public class App {

    public static void main(String[] args) {
        User inGameUser = new User();
        inGameUser.setName("Enter your name...");
        System.out.println("Hello " + inGameUser.getName() + ", We're going to play a little game of \"Rock, Paper, Scissors\"");
        inGameUser.setAnswer("Do you know the rules?");

        Game play= new Game();
        play.brainGame(play.roundsInput());
}}
