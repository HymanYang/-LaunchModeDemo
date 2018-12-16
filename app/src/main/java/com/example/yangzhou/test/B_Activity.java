package com.example.yangzhou.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Queue;

public class B_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //finish指定在启下一个页面之前,故 摧毁了当前栈，新创建了另一个栈, 导致了 后续的问题

                B_Activity.this.finish();

                Intent intent = new Intent(B_Activity.this.getApplicationContext(),C_Activity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                B_Activity.this.getApplicationContext().startActivity(intent);

            }
        });
    }
}
