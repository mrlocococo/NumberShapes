package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare(){

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

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

    public void testNumber (View view) {

        Log.i("Info", "button pressed");

        EditText editText = (EditText) findViewById(R.id.editText);

        String message;

        if (editText.getText().toString().isEmpty()) {

            message = "Please enter a number";

        } else {

            Number myNumber = new Number();

            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSquare() && myNumber.isTriangular()) {

                message = message + " is square and triangular!";

            } else if (myNumber.isSquare()) {

                message = message + " is square but not triangular";

            } else if (myNumber.isTriangular()) {

                message = message + " is triangular but not square";

            } else {

                message = message + " is neither triangular or square";

            }

        }

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}