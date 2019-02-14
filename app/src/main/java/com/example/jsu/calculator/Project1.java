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

public class Project1 extends AppCompatActivity {

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

    public void clearButtonClicked(View v) {

        TextView o = (TextView) findViewById(R.id.outputLabel);

        o.setText("");
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
