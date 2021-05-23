package com.example.project11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Running_btn=(Button)findViewById(R.id.Running_btn);
        Running_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        Button Collabo_btn=(Button)findViewById(R.id.Collabo_btn);
        Collabo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(MainActivity2.this, Collaboration.class);
                //startActivity(intent);
            }
        });
        Button Gaming_btn=(Button)findViewById(R.id.Gaming_btn);
        Gaming_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, GamingActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.menu_profile:
                Intent intent = new Intent(this, ProfileMainActivity.class);
                startActivity(intent);
                return true;
            case R.id.menu_history:
                Intent intent1 = new Intent(this, HistoryMainActivity.class);
                startActivity(intent1);
                return true;
            case R.id.menu_friends:
                Intent intent2 = new Intent(this, Friends__.class);
                //startActivity(intent2);
            case R.id.menu_settings:
                Intent intent3 = new Intent(this, Setting__.class);
                //startActivity(intent3);
        }
        return super.onOptionsItemSelected(item);
    }
}
