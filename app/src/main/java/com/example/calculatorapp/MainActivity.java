package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(){
        Intent intent = getIntent();
        String showName = intent.getStringExtra("");
        TextView firstNum = findViewById(R.firstNumber);
        TextView secondNum = findViewById(R.secondNumber);
        String numOne = firstNum.getText().toString();
        String numTwo = secondNum.getText().toString();
        int number1 = Integer.parseInt(numOne);
        int number2 = Integer.parseInt(numTwo);
        int solution;
        if(){
            
        }
        String wordSolution = ("" + solution);
        EditText editText = (EditText) findViewById(R.id.answer);
        editText.setText(wordSolution);
    }
}
