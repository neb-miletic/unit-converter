package com.example.unitconverter_neb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Slide;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        Button buttonDistance = findViewById(R.id.buttonDistance);
        Button buttonTemp = findViewById(R.id.buttonTemp);
        Button buttonWeight = findViewById(R.id.buttonWeight);




        EditText inputValue = findViewById(R.id.inputValue);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        ArrayList category = new ArrayList<String>();

        category.add("Meters");
        category.add("Celsiuses");
        category.add("Kilograms");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, category);
        spinner.setAdapter(adapter);


                buttonDistance.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double cm;
                        double inch;
                        double foot;


                        Double amount = Double.parseDouble(inputValue.getText().toString());

                        if (spinner.getSelectedItem().toString() == "Meters") {
                            cm = amount*100.0;
                            textView1.setText(Double.toString(cm) + " " + "cm");


                            inch =(double) Math.round(amount / 0.0254);
                            textView2.setText(Double.toString(inch) + " " + "inches");

                            foot = Math.round(amount / 0.3048);
                            textView3.setText(Double.toString(foot) + " " + "feet");


                        }

                        else {
                            Toast toast = Toast.makeText(getApplicationContext(), "You have chosen wrong conversion. Please try again", Toast.LENGTH_SHORT);
                            toast.setGravity(4, 5, 5);
                            toast.show();

                        }
                    }
                });

                buttonTemp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double fahrenheits;
                        double kelvin;


                        Double amount = Double.parseDouble(inputValue.getText().toString());

                        if (spinner.getSelectedItem().toString() == "Celsiuses") {
                            fahrenheits = Math.round(amount * 1.8 + 32);
                            textView1.setText(Double.toString(fahrenheits) + " " + "Farenheith");

                            kelvin = amount + 273.15;
                            textView2.setText(Double.toString(kelvin) + " " + "Kelvins");

                            textView3.setText(" ");


                        }
                         else {
                            Toast toast = Toast.makeText(getApplicationContext(), "You have chosen wrong conversion. Please try again", Toast.LENGTH_SHORT);
                            toast.setGravity(3, 5, 5);
                            toast.show();

                        }
                    }
                });


                buttonWeight.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double gram;
                        double ounce;
                        double pound;


                        Double amount = Double.parseDouble(inputValue.getText().toString());

                        if (spinner.getSelectedItem().toString() == "Kilograms") {
                            gram =amount * 100;
                            textView1.setText(Double.toString(gram) + " " + "grams");


                            ounce = Math.round( amount / 0.02834952);
                            textView2.setText(Double.toString(ounce) + " " + "ounce");

                            pound = Math.round( amount / 0.45359237);
                            textView3.setText(Double.toString(pound) + " " + "pounds");


                        }
                         else {
                            Toast toast = Toast.makeText(getApplicationContext(), "You have chosen wrong conversion. Please try again", Toast.LENGTH_SHORT);
                            toast.setGravity(3, 5, 5);
                            toast.show();

                        }



                    }
                });


        }



    }



