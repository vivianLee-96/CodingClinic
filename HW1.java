package com.example.vivian.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;



public class HW1 extends AppCompatActivity {
    TextView text1, text2;
    Button btn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1);
        setTitle("first HW");

        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        btn = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.img);


        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                text1.setVisibility(View.INVISIBLE);
                text2.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hw1, menu);
        return true;
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
