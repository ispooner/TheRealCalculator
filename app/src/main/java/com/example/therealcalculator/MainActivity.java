package com.example.therealcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView numText;
    /*
        Life Cycle of an activity
            - onCreate - Activity is actually created
            - onStart - Activity is being called to the foreground
            - onResume - Activity is actually visible to the user at this point
            - onPause - activity is partially visible
            - onStop - Activity is no longer visible to the user
            - onRestart -
            - onDestroy - Activity has been destroyed
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Inside onCreate()");
        numText = findViewById(R.id.number_text);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Inside onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Inside onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Inside onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Inside onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Inside onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Inside onDestroy()");
    }

    Float saved = 0.0f;
    Float display = 0.0f;
    Boolean afterDec = false;

    public void onButtonClicked(View view) {
        if(!afterDec) {
            switch (view.getId()) {
                case R.id.button_0:
                    display = display * 10.0f + 0.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_1:
                    display = display * 10.0f + 1.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_2:
                    display = display * 10.0f + 2.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_3:
                    display = display * 10.0f + 3.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_4:
                    display = display * 10.0f + 4.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_5:
                    display = display * 10.0f + 5.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_6:
                    display = display * 10.0f + 6.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_7:
                    display = display * 10.0f + 7.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_8:
                    display = display * 10.0f + 8.0f;
                    numText.setText(display.toString());
                    break;
                case R.id.button_9:
                    display = display * 10.0f + 9.0f;
                    numText.setText(display.toString());
                    break;
            }
        }
        else {

        }
    }
}
