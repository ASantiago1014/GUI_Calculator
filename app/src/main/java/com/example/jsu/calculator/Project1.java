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
    private boolean addButtonFlag;
    private boolean subButtonFlag;
    private boolean multButtonFlag;
    private boolean divButtonFlag;

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
    
    public void onClick(View v) {

        String id = (v.getResources().getResourceName(v.getId())).split("/")[1];

        switch (id) {

            case "addButton":
                addButtonClicked();
                break;

            case "subtractButton":
                subButtonClicked();
                break;

            case "divisionButton":
                divisionButtonClicked();
                break;

            case "multiplyButton":
                multiplyButtonClicked();
                break;

            case "percentButton":
                percentButtonClicked();
                break;

            case "squareRootButton":
                sqrtButtonClicked();
                break;

            case "clearButton":
                clearButtonClicked();
                break;

            case "equalButton":
                equalButtonClicked();
                break;

            case "decimalButton":
                decimalButtonClicked();
                break;

            case "signButton":
                signButtonClicked();
                break;

            case "zeroButton":
                zeroButtonClicked();
                break;

            case "oneButton":
                oneButtonClicked();
                break;

            case "twoButton":
                twoButtonClicked();
                break;

            case "threeButton":
                threeButtonClicked();
                break;

            case "fourButton":
                fourButtonClicked();
                break;

            case "fiveButton":
                fiveButtonClicked();
                break;

            case "sixButton":
                sixButtonClicked();
                break;

            case "sevenButton":
                sevenButtonClicked();
                break;

            case "eightButton":
                eightButtonClicked();
                break;

            case "nineButton":
                nineButtonClicked();
                break;

            default:
                ;
        }
    }

    public void oneButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("1");
        }

        else {

            o.setText(o.getText() + "1");
        }
    }

    public void twoButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("2");
        }

        else {

            o.setText(o.getText() + "2");
        }
    }

    public void threeButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("3");
        }

        else {

            o.setText(o.getText() + "3");
        }
    }

    public void fourButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("4");
        }

        else {

            o.setText(o.getText() + "4");
        }
    }

    public void fiveButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("5");
        }

        else {

            o.setText(o.getText() + "5");
        }
    }

    public void sixButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("6");
        }

        else {

            o.setText(o.getText() + "6");
        }
    }

    public void sevenButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("7");
        }

        else {

            o.setText(o.getText() + "7");
        }
    }

    public void eightButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("8");
        }

        else {

            o.setText(o.getText() + "8");
        }
    }

    public void nineButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            o.setText("9");
        }

        else {

            o.setText(o.getText() + "9");
        }
    }

    public void zeroButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.getText().toString();

        if (o.getText() == "0") {

            ;
        }

        else {

            o.setText(o.getText() + "0");
        }
    }

    public void clearButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.setText("0");

        firstNumber = 0;
        secondNumber = 0;
        result = 0;
        addButtonFlag = false;
        subButtonFlag = false;
        multButtonFlag = false;
        divButtonFlag = false;
    }

    public void equalButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        secondNumber = Double.parseDouble(o.getText().toString());

        if (addButtonFlag == true) {
            result = firstNumber + secondNumber;
            addButtonFlag = false;
        }

        else if (subButtonFlag == true) {
            result = firstNumber - secondNumber;
            subButtonFlag = false;
        }
        else if (multButtonFlag == true) {
            result = firstNumber * secondNumber;
            multButtonFlag = false;
        }

        else if (divButtonFlag == true) {
            result = firstNumber / secondNumber;
            divButtonFlag = false;
        }


        o.setText(String.valueOf(result));

        result = 0;
        firstNumber = 0;
        secondNumber = 0;
    }

    public void signButtonClicked() {

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

    public void decimalButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (value == "")
            o.setText("0.");

        else if (value.contains("."))
            ;

        else
            o.setText(value + ".");

    }

    public void sqrtButtonClicked() {

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

    public void percentButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (value == "" || value == "0" || firstNumber == 0)
            ;

        else {

            secondNumber = Double.parseDouble(value);

            if (multButtonFlag == true || divButtonFlag == true) {

                secondNumber = secondNumber / 100;
            }

            else {

                secondNumber = firstNumber * (secondNumber / 100);
            }

            o.setText(String.valueOf(secondNumber));
        }

    }


    public void addButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else if (addButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber + secondNumber;

            secondNumber = 0;

            o.setText("");

            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (subButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = true;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (multButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber * secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = true;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (divButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = true;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else {



            firstNumber = Double.parseDouble(value);

            o.setText("");

            addButtonFlag = true;


        }
    }

    public void subButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else if (addButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber + secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = true;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (subButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = true;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (multButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber * secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = true;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else if (divButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = true;
            multButtonFlag = false;
            divButtonFlag = false;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");

            subButtonFlag = true;


        }
    }

    public void multiplyButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else if (addButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber + secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = true;
            divButtonFlag = false;
        }

        else if (subButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = true;
            divButtonFlag = false;
        }

        else if (multButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber * secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = true;
            divButtonFlag = false;
        }

        else if (divButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = true;
            divButtonFlag = false;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");

            multButtonFlag = true;


        }
    }

    public void divisionButtonClicked() {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        value = o.getText().toString();

        if (o.getText() == "0" || o.getText() == "") {
            ;
        }

        else if (addButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber + secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = true;
        }

        else if (subButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = true;
        }

        else if (multButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber * secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = true;
        }

        else if (divButtonFlag == true) {

            secondNumber = Double.parseDouble(value);

            firstNumber = firstNumber - secondNumber;

            secondNumber = 0;

            o.setText("");

            addButtonFlag = false;
            subButtonFlag = false;
            multButtonFlag = false;
            divButtonFlag = true;
        }

        else {

            firstNumber = Double.parseDouble(value);

            o.setText("");

            divButtonFlag = true;


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
