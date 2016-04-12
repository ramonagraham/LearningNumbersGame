package net.greenrivertech.ramona.learningnumbersgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class LearningNumbersMainActivity extends AppCompatActivity {

    private LearningNumbersGameModel model = new LearningNumbersGameModel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_numbers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // Generate random numbers for buttons
        // and display new numbers on buttons
        model.generateNumbers();
        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("" + model.getButton1() );

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("" + model.getButton2() );

        Button bScore = (Button) findViewById(R.id.buttonScore);
        bScore.setText("" + model.getScore() );

        Button bGamesPlayed = (Button) findViewById(R.id.buttonGamesPlayed);
        bGamesPlayed.setText("" + model.getGamesPlayed() );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learning_numbers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /** determine if button1 is the correct answer */
    public void handleButton1(View view){
        boolean result = model.play(LearningNumbersGameModel.BUTTON_ONE);
        model.generateNumbers();
        model.getButton1();
        model.getButton2();

        model.getScore();
        Button bScore = (Button) findViewById(R.id.buttonScore);
        bScore.setText("" + model.getScore());

        model.getGamesPlayed();
        showToastMessage("You clicked the first button!");

        //Button bScore = (Button) findViewById(R.id.buttonScore);
        bScore.setText("" + model.getScore());

        Button bGamesPlayed = (Button) findViewById(R.id.buttonGamesPlayed);
        bGamesPlayed.setText("" + model.getGamesPlayed());

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("" + model.getButton1() );

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("" + model.getButton2() );

    }

    /** determine if button2 is the correct answer */
    public void handleButton2(View view) {
        boolean result = model.play(LearningNumbersGameModel.BUTTON_TWO);
        model.generateNumbers();
        model.getButton1();
        model.getButton2();

        model.getScore();
        Button bScore = (Button) findViewById(R.id.buttonScore);
        bScore.setText("" + model.getScore());

        model.getGamesPlayed();
        Button bGamesPlayed = (Button) findViewById(R.id.buttonGamesPlayed);
        bGamesPlayed.setText("" + model.getGamesPlayed());

        Button b1 = (Button) findViewById(R.id.button1);
        b1.setText("" + model.getButton1() );

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setText("" + model.getButton2() );

        showToastMessage("You clicked the second button!");
    }

    public void showToastMessage(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }

}
