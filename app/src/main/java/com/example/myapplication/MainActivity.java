package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < number) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {

                return true;

            } else {

                return false;

            }

        }

    }

    Number myNumber = new Number();

    myNumber.number = 6;

    System.out.println(myNumber.isTriangular());

    public void testNumber (View view) {

        Log.i("Info", "button pressed");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}