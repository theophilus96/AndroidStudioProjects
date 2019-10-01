package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {


    // References to UI views
    TextView    txtCount;
    RadioButton rBtnUp, rBtnDown;
    Button      btnCount;

    int count = 0; // counter value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);
        // Retrieve references to UI views by their id in XML layout
        rBtnUp = (RadioButton) findViewById(R.id.rBtnUpId);
        rBtnDown = (RadioButton) findViewById(R.id.rBtnDownId);
        txtCount = (TextView) findViewById(R.id.txtCountId);
        txtCount.setText(String.valueOf(count)); // Display initial count
        btnCount = (Button) findViewById(R.id.btnCountId);
        // REMOVE the btnCount.setOnClickListener()
    }

    // ADD the following Button's onClick handler (set in XML layout)
    public void btnCountOnClickHandler(View v) {
        if (rBtnUp.isChecked()) {          // Counting up
            count += 2;   // Step of 2
        } else if (rBtnDown.isChecked()) { // Counting down
            count -= 2;   // Step of 2
        }
        txtCount.setText(String.valueOf(count));
    }

}
