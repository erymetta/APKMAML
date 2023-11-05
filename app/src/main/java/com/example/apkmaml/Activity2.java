package com.example.apkmaml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        TextView tv3 = findViewById(R.id.textView3);
        Button bt7 = findViewById(R.id.button7);
        Button bt8 = findViewById(R.id.button8);
        Button bt9 = findViewById(R.id.button9);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(Activity2.this, Activity1.class);
                startActivity(iPindah1);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(Activity2.this, Activity3.class);
                startActivity(iPindah1);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}
