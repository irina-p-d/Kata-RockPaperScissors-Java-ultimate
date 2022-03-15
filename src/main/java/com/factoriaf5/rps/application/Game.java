package com.factoriaf5.rps.application;

public class Game {
    public String play(String player1, String player2) {
        String winner = this.checkWinner(player1, player2);
        return winner;      
    }

    public String checkWinner(String option1, String option2) {
        if(option1.equals("Paper") && option2.equals("Rock")) {
            return "Win " + option1;
        }

        if(option1.equals("Rock") && option2.equals("Scissors")) {
            return "Win " + option1;
        }

        if(option1.equals("Scissors") && option2.equals("Paper")) {
            return  "Win " + option1;
        }
        return "Nobody won";
    }
}