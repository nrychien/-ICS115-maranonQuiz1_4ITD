package com.maranon.maranonquiz1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Donut extends AppCompatActivity {

    ImageView logo;
    TextView name,version, api, date;
    Button home, btn1, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donut);

        logo = (ImageView) findViewById(R.id.logo);
        name = (TextView) findViewById(R.id.name);
        version = (TextView) findViewById(R.id.version);
        api = (TextView) findViewById(R.id.api);
        date = (TextView) findViewById(R.id.date);
        home = (Button) findViewById(R.id.home);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
    }

    public void Home (View view) {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
