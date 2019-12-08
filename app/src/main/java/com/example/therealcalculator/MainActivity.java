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

    TextView storageText;
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
        storageText = findViewById(R.id.storage_text);
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

    Previous saved = new Previous();
    Float display = 0.0f;
    Float dec = 1f;
    Boolean afterDec = false;
    Float sign = 1f;

    public void onNumberClicked(View view) {
        if(!afterDec) {
            switch (view.getId()) {
                case R.id.button_0:
                    display = display * 10.0f + 0.0f * sign;
                    break;
                case R.id.button_1:
                    display = display * 10.0f + 1.0f * sign;
                    break;
                case R.id.button_2:
                    display = display * 10.0f + 2.0f * sign;
                    break;
                case R.id.button_3:
                    display = display * 10.0f + 3.0f * sign;
                    break;
                case R.id.button_4:
                    display = display * 10.0f + 4.0f * sign;
                    break;
                case R.id.button_5:
                    display = display * 10.0f + 5.0f * sign;
                    break;
                case R.id.button_6:
                    display = display * 10.0f + 6.0f * sign;
                    break;
                case R.id.button_7:
                    display = display * 10.0f + 7.0f * sign;
                    break;
                case R.id.button_8:
                    display = display * 10.0f + 8.0f * sign;
                    break;
                case R.id.button_9:
                    display = display * 10.0f + 9.0f * sign;
                    break;
            }
            numText.setText(String.format("%.0f", display));
        }
        else {
            dec = dec * 0.1f;
            switch (view.getId()) {
                case R.id.button_0:
                    display = display + dec * 0.0f  * sign;
                    break;
                case R.id.button_1:
                    display = display + dec * 1.0f * sign;
                    break;
                case R.id.button_2:
                    display = display + dec * 2.0f * sign;
                    break;
                case R.id.button_3:
                    display = display + dec * 3.0f * sign;
                    break;
                case R.id.button_4:
                    display = display + dec * 4.0f * sign;
                    break;
                case R.id.button_5:
                    display = display + dec * 5.0f * sign;
                    break;
                case R.id.button_6:
                    display = display + dec * 6.0f * sign;
                    break;
                case R.id.button_7:
                    display = display + dec * 7.0f * sign;
                    break;
                case R.id.button_8:
                    display = display + dec * 8.0f * sign;
                    break;
                case R.id.button_9:
                    display = display + dec * 9.0f * sign;
                    break;
            }
            numText.setText(String.format("%f", display));
        }
        //numText.setText(display.toString());
    }

    public void onOperatorClick(View view) {
        switch (view.getId()) {
            case R.id.button_plus:
                calculate();
                saved.operation = op.addition;
                storageText.setText(String.format("%f+", saved.number));
                numText.setText("0");
                display = 0.0f;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_minus:
                calculate();
                saved.operation = op.subtraction;
                storageText.setText(String.format("%f-", saved.number));
                numText.setText("0");
                display = 0.0f;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_mult:
                calculate();
                saved.operation = op.multiplication;
                storageText.setText(String.format("%fx", saved.number));
                numText.setText("0");
                display = 0.0f;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_div:
                calculate();
                saved.operation = op.division;
                storageText.setText(String.format("%f/", saved.number));
                numText.setText("0");
                display = 0.0f;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_AC:
                storageText.setText("");
                numText.setText("0");
                display = 0.0f;
                saved.number = 0.0f;
                saved.operation = op.addition;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_negate:
                display = display * -1f;
                sign = sign * -1f;
                if(!afterDec) {
                    numText.setText(String.format("%.0f", display));
                }
                else {
                    numText.setText(display.toString());
                }
                break;
            case R.id.button_percent:
                display = display / 100;
                afterDec = true;
                dec = dec * 0.01f;
                numText.setText(String.format("%f", display));
                break;
            case R.id.button_equals:
                calculate();
                display = saved.number;
                storageText.setText("");
                numText.setText(String.format("%f", display));
                saved.number = 0f;
                saved.operation = op.addition;
                afterDec = false;
                dec = 1f;
                break;
            case R.id.button_decimal:
                afterDec = true;
                numText.setText(String.format("%.1f", display));
                break;
        }
    }

    private void calculate() {
        Float stor = saved.number;
        switch (saved.operation) {
            case addition:
                saved.number = stor + display;
                break;
            case subtraction:
                saved.number = stor - display;
                break;
            case multiplication:
                saved.number = stor * display;
                break;
            case division:
                saved.number = stor / display;
                break;
        }
    }
}

enum op {
    addition,
    subtraction,
    multiplication,
    division
}

class Previous {
    Float number;
    op operation;

    Previous() {
        number = 0.0f;
        operation = op.addition;
    }
}
