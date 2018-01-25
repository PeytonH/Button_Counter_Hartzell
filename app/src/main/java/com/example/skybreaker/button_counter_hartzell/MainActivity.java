package com.example.skybreaker.button_counter_hartzell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity
{
    private TextView text;
    private Integer counter;
    private Button increment;
    private Button decrement;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment = (Button) findViewById(R.id.incrementButton);
        decrement = (Button) findViewById(R.id.decrementButton);
        clear = (Button) findViewById(R.id.clearButton);
        text = (TextView) findViewById(R.id.counterview);


        increment.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                counter += 1;
                text.setText(counter.toString());

            }
        });
        decrement.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                counter -= 1;
                text.setText(counter.toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                counter = 0;
                text.setText(counter.toString());
            }
        });
    }
}
