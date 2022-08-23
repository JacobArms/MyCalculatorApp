package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(){
        Intent intent = getIntent();
        String showName = intent.getStringExtra("");
        TextView firstNum = findViewById(R.id.firstNumber);
        TextView secondNum = findViewById(R.id.secondNumber);
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
