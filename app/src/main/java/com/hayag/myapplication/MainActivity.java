package com.hayag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    public final static String EXTRA_MESSAGE = "hayag.com.MESSAGE";
    public final static String EXTRA_MESSAGE1 = "hayag.com.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "hayag.com.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "hayag.com.MESSAGE3";
    public final static String EXTRA_MESSAGE4 = "hayag.com.MESSAGE4";
    public final static String EXTRA_MESSAGE5 = "hayag.com.MESSAGE5";
    public final static String EXTRA_MESSAGE6 = "hayag.com.MESSAGE6";
    public final static String EXTRA_MESSAGE7 = "hayag.com.MESSAGE7";
    public final static String EXTRA_MESSAGE8 = "hayag.com.MESSAGE8";
    public final static String EXTRA_MESSAGE9 = "hayag.com.MESSAGE9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, revieworder.class);
        RadioGroup rg = findViewById(R.id.rggroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rb1){
                    intent.putExtra("EXTRA_MESSAGE", "Chicken");
                }
                else
                    intent.putExtra("EXTRA_MESSAGE", "Beef");
            }
        });
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText a = findViewById(R.id.name);
                EditText b = findViewById(R.id.phone);
                EditText c = findViewById(R.id.address);

                intent.putExtra("EXTRA_MESSAGE1", a.getText().toString());
                intent.putExtra("EXTRA_MESSAGE2", b.getText().toString());
                intent.putExtra("EXTRA_MESSAGE3", c.getText().toString());

                startActivity(intent);
            }
        });

        final CheckBox cb = findViewById(R.id.checkBox);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE4", "Bacon");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE4");
            }
        });
        final CheckBox cb2 = findViewById(R.id.checkBox2);
        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb2.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE5", "Pineapple");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE5");
            }
        });
        final CheckBox cb3 = findViewById(R.id.checkBox3);
        cb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb3.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE6", "Lettuce");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE6");
            }
        });
        final CheckBox cb4 = findViewById(R.id.checkBox4);
        cb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb4.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE7", "Pickles");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE7");
            }
        });
        final CheckBox cb5 = findViewById(R.id.checkBox5);
        cb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb5.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE8", "Cheese");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE8");
            }
        });
        final CheckBox cb6 = findViewById(R.id.checkBox6);
        cb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cb6.isChecked()) {
                    intent.putExtra("EXTRA_MESSAGE9", "Mustard");
                }
                else
                    intent.removeExtra("EXTRA_MESSAGE9");
            }
        });
    }
}
