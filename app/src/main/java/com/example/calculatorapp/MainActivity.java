package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    // FOUND ONLINE
    // Once the Easter Egg button is clicked at the bottom of the page,
    // the image will move left to right and then right to left
    public void imageClick(View view){
        //Grabs the image of Dr Heinz
        ImageView imageView = (ImageView) findViewById(R.id.drHeinz);
        //Sets the xFrom, xTo, yFrom, and yTo
        TranslateAnimation animation = new TranslateAnimation(-160.0f,160.0f, 0.0f, 0.0f);
        animation.setDuration(800);    //animation duration, impacts the speed of the animation as well
        animation.setRepeatCount(5);    //Sets the repeat count
        animation.setRepeatMode(2);     //Repeat animation from (left to right, right to left)
        imageView.startAnimation(animation);    //Starts the animation of the image on the page
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int problem = 0;
    public void add(View view){
        problem = 1;
        calculate();
    }
    public void subtract(View view){
        problem = 2;
        calculate();
    }
    public void multiply(View view){
        problem = 3;
        calculate();
    }
    public void divide(View view){
        problem = 4;
        calculate();
    }

    public void calculate(){
        int number1 = 0;
        int number2 = 0;
        int i = 1;
        // In theory this try-catch checks to see if the edit text boxes are empty and prompts the user
        // to input integers before clicking the buttons
        Intent intent = getIntent();
        EditText alertText = (EditText) findViewById(R.id.alert);
        String showName = intent.getStringExtra("");
        TextView firstNum = findViewById(R.id.firstNumber);
        TextView secondNum = findViewById(R.id.secondNumber);
        String numOne = firstNum.getText().toString();
        String numTwo = secondNum.getText().toString();
        // This try-catch checks to see if the edit text boxes are empty and prompts the user
        // to input integers before clicking the buttons
        while(i == 1){
            try{
                if(numOne.matches("")){
                    alertText.setText("PLEASE ENTER INTEGERS");
                }else if(numTwo.matches("")){
                    alertText.setText("PLEASE ENTER INTEGERS");
                }else{
                    number1 = Integer.parseInt(numOne);
                    number2 = Integer.parseInt(numTwo);
                }
                i = 2;
            }catch (InputMismatchException e){
                alertText.setText("PLEASE ENTER INTEGERS ONLY");
            }
        }
//        number1 = Integer.parseInt(numOne);
//        number2 = Integer.parseInt(numTwo);
        double solution = 0;
        //Checks to see what math equation the user wants
        if(problem == 1){   //Addition
            solution = number1 + number2;
        }else if(problem == 2){ //Subtraction
            solution = number1 - number2;
        }else if(problem == 3){ //Multiplication
            solution = number1 * number2;
        }else if(problem == 4){ //Division
            solution = (double) number1 / number2;
        }
        String wordSolution = ("" + solution);
        // Rounds the decimal of a large decimal number to the first 6 numbers
        if(problem!=4 && wordSolution.charAt(wordSolution.length()-1)==1){
            wordSolution = wordSolution.substring(0,wordSolution.length()-2);
        }
        if(problem == 4 && wordSolution.length()>7){
            wordSolution = wordSolution.substring(0,7);
        }
        EditText editText = (EditText) findViewById(R.id.answer);
        editText.setText(wordSolution);
    }
}
