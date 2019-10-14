package com.example.android.ccounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;
    int TeamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        displayForTeamB(0);
        displayForTeamA(0);
        displayForBothTeams(0);

    }


    /**
     * These handles team team a's functionality
     */

    public void point3a(View v){
    TeamAScore = TeamAScore + 3;
    displayForTeamA(TeamAScore);
    }

    public void point2a(View v){

        TeamAScore = TeamAScore + 2;
        displayForTeamA(TeamAScore);
    }

    public void freethrow_a(View v){

        TeamAScore = TeamAScore + 1;
        displayForTeamA(TeamAScore);
    }

    public void displayForTeamA(int score){
        TextView tv = (TextView) findViewById(R.id.team_a_score);
        tv.setText(String.valueOf(score));
    }


    /**
     * This section handles team B
     * @param v
     */

    public void point3b(View v){

        TeamBScore = TeamBScore + 3;
        displayForTeamB(TeamBScore);
    }

    public void point2b(View v){
        TeamBScore = TeamBScore + 2;
        displayForTeamB(TeamBScore);

    }


    public void freethrow_b(View v){
        TeamBScore = TeamBScore + 1;
        displayForTeamB(TeamBScore);
    }


    public void displayForTeamB(int scoreB ){
        TextView tv = (TextView) findViewById(R.id.team_b_score);
        tv.setText(String.valueOf(scoreB));
    }

    public void reset(View v){
        TeamBScore = 0;
        TeamAScore = 0;
        displayForBothTeams(TeamAScore);
        displayForBothTeams(TeamBScore);

    }

    /**
     * This method is called when the reset button is clicked
     * @param both
     */
    public void displayForBothTeams(int both){
        TextView tv = (TextView) findViewById(R.id.team_a_score);
        tv.setText(String.valueOf(both));

        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(String.valueOf(both));
    }
}
