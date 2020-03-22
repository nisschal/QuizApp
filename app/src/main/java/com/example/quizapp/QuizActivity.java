package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {
    private Button submitButton;
    private int score;
    private RadioGroup numOneRadioGroup;
    private EditText editText;
    private CheckBox nit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        submitButton=findViewById(R.id.submit_button);
        nit= findViewById(R.id.nit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nit.isChecked() && nit.isChecked() && !nit.isChecked() && !nit.isChecked()){
                    score +=1;
                }

                Intent intent= new Intent(QuizActivity.this, ScoreActivity.class);
                intent.putExtra("Score", "6/10");
                startActivity(intent);
            }


        });

        numOneRadioGroup= findViewById(R.id.num_one_radio_group);
        numOneRadioGroup.clearCheck();
        numOneRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId== R.id.Antoine)
                    score +=1;
            }
        });

    }
}
