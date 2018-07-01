package com.example.sarthakbabbar.form;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        TextView nameView=(TextView)findViewById(R.id.fn);
        nameView.setText(getIntent().getExtras().getString("fn"));

        TextView nameView1=(TextView)findViewById(R.id.ln);
        nameView1.setText(getIntent().getExtras().getString("ln"));

        TextView nameView2=(TextView)findViewById(R.id.gender);
        nameView2.setText(getIntent().getExtras().getString("gender"));

        TextView nameView3=(TextView)findViewById(R.id.pass);
        nameView3.setText(getIntent().getExtras().getString("pass"));

        TextView nameView4=(TextView)findViewById(R.id.country);
        nameView4.setText(getIntent().getExtras().getString("country"));

        TextView nameView5=(TextView)findViewById(R.id.oc);
        nameView5.setText(getIntent().getExtras().getString("oc"));

    }
}
