package com.example.adri9ps.relative_grid_layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.album1:
                Intent i ;
                i = new Intent(this,MainActivity.class);
                startActivity(i);
                break;

            case R.id.album2:
                Intent i2 ;
                i2 = new Intent(this,Activity2.class);
                startActivity(i2);
                break;

            case R.id.album3:
                Intent i3 ;
                i3 = new Intent(this,Activity3.class);
                startActivity(i3);
                break;

            case R.id.album4:
                Intent i4;
                i4 = new Intent(this,Activity4.class);
                startActivity(i4);
                break;

        }
    }
}
