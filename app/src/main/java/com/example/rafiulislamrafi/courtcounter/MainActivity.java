package com.example.rafiulislamrafi.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int team_A_Score = 0, team_B_Score = 0;

    TextView textView, textView2;
    Button button, button2, button3, button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objCast();
        team_A_Button_Click();
        team_B_Button_Click();
        resetButtonClick();
    }

    public void objCast(){

        textView = (TextView) findViewById(R.id.Team_A_Score);
        textView2 = (TextView) findViewById(R.id.Team_B_Score);

        button = (Button) findViewById(R.id.Team_A_3_Button);
        button2 = (Button) findViewById(R.id.Team_A_2_Button);
        button3 = (Button) findViewById(R.id.Team_A_Free_Button);

        button4 = (Button) findViewById(R.id.Team_B_3_Button);
        button5 = (Button) findViewById(R.id.Team_B_2_Button);
        button6 = (Button) findViewById(R.id.Team_B_Free_Button);

        button7 = (Button) findViewById(R.id.ResetButton);
    }

    public void team_A_Button_Click(){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_A_Score = team_A_Score + 3;
                textView.setText(""+team_A_Score);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_A_Score = team_A_Score + 2;
                textView.setText(""+team_A_Score);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_A_Score = team_A_Score + 1;
                textView.setText(""+team_A_Score);
            }
        });
    }


    public void team_B_Button_Click(){

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_B_Score = team_B_Score + 3;
                textView2.setText(""+team_B_Score);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_B_Score = team_B_Score + 2;
                textView2.setText(""+team_B_Score);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_B_Score = team_B_Score + 1;
                textView2.setText(""+team_B_Score);
            }
        });
    }

    public void resetButtonClick(){

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_A_Score = 0;
                textView.setText(""+team_A_Score);

                team_B_Score = 0;
                textView2.setText(""+team_B_Score);
            }
        });
    }

}
