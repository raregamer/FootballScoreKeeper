package com.example.samue.footballscorekeeper;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeTeamScore = 0;
    int awayTeamScore = 0;
    int quarter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//home team methods
    public void touchdown(View view) {
        homeTeamScore += 6;
        displayForHomeTeam(homeTeamScore);
    }

    public void extraPoint(View view) {
        homeTeamScore += 1;
        displayForHomeTeam(homeTeamScore);
    }

    public void fieldGoal(View view){
        homeTeamScore += 3;
        displayForHomeTeam(homeTeamScore);
    }

    public  void safety(View view) {
        homeTeamScore += 2;
        displayForHomeTeam(homeTeamScore);
    }


//display for the home team.
    public void displayForHomeTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.home_team_score_board);
        scoreView.setText(String.valueOf(score));
    }

    //away team methods.

    public void touchdownAway(View view) {
        awayTeamScore += 6;
        displayForAwayTeam(awayTeamScore);
    }

    public void extraPointAway(View view) {
        awayTeamScore += 1;
        displayForAwayTeam(awayTeamScore);
    }

    public void fieldGoalAway(View view){
        awayTeamScore += 3;
        displayForAwayTeam(awayTeamScore);
    }

    public  void safetyAway(View view) {
        awayTeamScore += 2;
        displayForAwayTeam(awayTeamScore);
    }


    //display for the away team
    public void displayForAwayTeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.away_team_score_board);
        scoreView.setText(String.valueOf(score));
    }

    //quarter display and method.

    public void displayForQuarter(int quarter) {
        TextView quarterView = (TextView) findViewById(R.id.quarterNumber);
        if (quarter <= 4) {
            quarterView.setText(String.valueOf(quarter));
        } else {
            quarterView.setText("OT");
        }
    }
    public void quarter(View view){
        quarter++;
        displayForQuarter(quarter);
    }

    public void newGame(View view){
        quarter = 0;
        homeTeamScore = 0;
        awayTeamScore = 0;
        displayForQuarter(quarter);
        displayForHomeTeam(homeTeamScore);
        displayForAwayTeam(awayTeamScore);
    }
}
