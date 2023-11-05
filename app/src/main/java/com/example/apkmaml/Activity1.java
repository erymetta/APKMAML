package com.example.apkmaml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        TextView tv2 = findViewById(R.id.textView2);
        Button bt4 = findViewById(R.id.button4);
        Button bt5 = findViewById(R.id.button5);
        Button bt6 = findViewById(R.id.button6);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(Activity1.this, Activity2.class);
                startActivity(iPindah1);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(Activity1.this, Activity3.class);
                startActivity(iPindah1);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}
