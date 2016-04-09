package net.greenrivertech.ramona.learningnumbersgame;

import java.util.Random;

/**
 * Created by Ramona on 4/8/2016.
 */
public class LearningNumbersGameModel {
    private int button1;
    private int button2;
    public static final int LEFT = 0;
    public static final int RIGHT = 0;

    public LearningNumbersGameModel() {

    }

    public boolean play(int choice) {
        return true;
    }

    public int getButton1() {
        return button1;
    }

    public int getButton2() {
        return button2;
    }

    public void generateNumbers() {
        Random randomNumber = new Random();
//        int number = randomNumber.nextInt(10) + 1;
//        return number;
        button1 = randomNumber.nextInt(10) + 1;
        button2 = randomNumber.nextInt(10) + 1;
    }

}
