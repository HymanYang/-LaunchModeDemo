package com.example.yangzhou.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * 仿生登录选择页面
 */
public class C_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(C_Activity.this.getApplicationContext(),D_Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                C_Activity.this.getApplicationContext().startActivity(intent);


                C_Activity.this.finish();


            }
        });
    }
}
