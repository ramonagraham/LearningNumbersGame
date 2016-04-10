package net.greenrivertech.ramona.learningnumbersgame;

import android.widget.Toast;

import java.util.Random;

/**
 * Created by Ramona on 4/8/2016.
 */
public class LearningNumbersGameModel {
    private int button1;
    private int button2;
    private int gamesPlayed;
    private int gamesWon;
    public static final int BUTTON_ONE = 0;
    public static final int BUTTON_TWO = 1;

    public LearningNumbersGameModel() {
        generateNumbers();
        gamesPlayed = 0;
        gamesWon = 0;
    }

    public boolean play(int choice) {
        gamesPlayed++;

        if(choice == 0 && button1 > button2) {
            gamesWon++;
            return true;
        }

        else if (choice == 1 && button2 > button1) {
            gamesWon++;
            return true;
        }

        else {
            return false;
        }
    }

    public void generateNumbers() {
        Random randomNumber = new Random();
        button1 = randomNumber.nextInt(10) + 1;
        button2 = randomNumber.nextInt(10) + 1;
    }



    public int getButton1() {
        return button1;
    }

    public int getButton2() {
        return button2;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getScore() {
        return gamesWon;
    }

}
