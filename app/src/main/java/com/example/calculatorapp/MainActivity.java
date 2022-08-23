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
    int problem = 0;
    public void add(){
        problem = 1;
        calculate();
    }
    public void subtract(){
        problem = 2;
        calculate();
    }
    public void multiply(){
        problem = 3;
        calculate();
    }
    public void divide(){
        problem = 4;
        calculate();
    }

    public void calculate(){
        Intent intent = getIntent();
        String showName = intent.getStringExtra("");
        TextView firstNum = findViewById(R.id.firstNumber);
        TextView secondNum = findViewById(R.id.secondNumber);
        String numOne = firstNum.getText().toString();
        String numTwo = secondNum.getText().toString();
        int number1 = Integer.parseInt(numOne);
        int number2 = Integer.parseInt(numTwo);
        int solution;
        if(problem == 1){
            
        }else if(){
            
        }else if(){
            
        }else if(){
            
        }
        String wordSolution = ("" + solution);
        EditText editText = (EditText) findViewById(R.id.answer);
        editText.setText(wordSolution);
    }
}
