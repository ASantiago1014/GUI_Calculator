package com.example.jsu.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.*;

public class Project1 extends AppCompatActivity {

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String value;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.setText("0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_project1, menu);
        return true;
    }

    public void oneButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("1");
        }

        else {

            o.setText(o.getText() + "1");
        }
    }

    public void twoButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("2");
        }

        else {

            o.setText(o.getText() + "2");
        }
    }

    public void threeButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("3");
        }

        else {

            o.setText(o.getText() + "3");
        }
    }

    public void fourButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("4");
        }

        else {

            o.setText(o.getText() + "4");
        }
    }

    public void fiveButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("5");
        }

        else {

            o.setText(o.getText() + "5");
        }
    }

    public void sixButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("6");
        }

        else {

            o.setText(o.getText() + "6");
        }
    }

    public void sevenButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("7");
        }

        else {

            o.setText(o.getText() + "7");
        }
    }

    public void eightButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("8");
        }

        else {

            o.setText(o.getText() + "8");
        }
    }

    public void nineButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("9");
        }

        else {

            o.setText(o.getText() + "9");
        }
    }

    public void zeroButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            ;
        }

        else {

            o.setText(o.getText() + "0");
        }
    }

    public void clearButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.setText("");

        firstNumber = 0;
        secondNumber = 0;
        result = 0;
    }

    public void equalButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.setText(String.valueOf(result));
    }

    public void signButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (value == "" || value == "0")
            ;


        else {

            if (value.contains(".")) {

                double signChangeDouble = Double.parseDouble(value);

                signChangeDouble = signChangeDouble * (-1);

                o.setText(String.valueOf(signChangeDouble));
            }

            else {

                int signChangeInt = Integer.parseInt(value);

                signChangeInt = signChangeInt * (-1);

                o.setText(String.valueOf(signChangeInt));

            }
        }
    }

    public void decimalButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (value == "")
            o.setText("0.");

        else if (value.contains("."))
            ;

        else
            o.setText(value + ".");

    }

    public void sqrtButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (value == "" || value == "0")
            ;

        else {

            double sqrtDouble = Double.parseDouble(value);

            result = Math.sqrt(sqrtDouble);

            o.setText(String.valueOf(result));
        }

    }

    public void percentButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();


    }

    public void addButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");


        }
    }

    public void subButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");


        }
    }

    public void multiplyButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");


        }
    }

    public void divisionButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");


        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
