package com.hayag.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class revieworder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revieworder);

        Intent intent = getIntent();

        String a = intent.getStringExtra("EXTRA_MESSAGE");
        String a1 = intent.getStringExtra("EXTRA_MESSAGE1");
        String a2 = intent.getStringExtra("EXTRA_MESSAGE2");
        String a3 = intent.getStringExtra("EXTRA_MESSAGE3");
        String a4 = intent.getStringExtra("EXTRA_MESSAGE4");
        String a5 = intent.getStringExtra("EXTRA_MESSAGE5");
        String a6 = intent.getStringExtra("EXTRA_MESSAGE6");
        String a7 = intent.getStringExtra("EXTRA_MESSAGE7");
        String a8 = intent.getStringExtra("EXTRA_MESSAGE8");
        String a9 = intent.getStringExtra("EXTRA_MESSAGE9");

        TextView tv = findViewById(R.id.tv1);
        tv.setText(a1);
        TextView tv1 = findViewById(R.id.tv2);
        tv1.setText(a2);
        TextView tv2 = findViewById(R.id.tv3);
        tv2.setText(a3);
        TextView tv3 = findViewById(R.id.type);
        tv3.setText(a);
        TextView tv4 = findViewById(R.id.textView12);
        tv4.setText(a4);
        TextView tv5 = findViewById(R.id.textView13);
        tv5.setText(a5);
        TextView tv6 = findViewById(R.id.textView14);
        tv6.setText(a6);
        TextView tv7 = findViewById(R.id.textView15);
        tv7.setText(a7);
        TextView tv8 = findViewById(R.id.textView16);
        tv8.setText(a8);
        TextView tv9 = findViewById(R.id.textView17);
        tv9.setText(a9);

        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(revieworder.this,"Order Has Been Placed",Toast.LENGTH_SHORT).show();
            }
        });
        Button btn1 = findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
