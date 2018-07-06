package com.example.win10.firstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doClick(View view){
        switch (view.getId()){
            case R.id.Welcome:
                Toast.makeText(MainActivity.this,"欢迎来到完美世界",Toast.LENGTH_SHORT).show();
            break;

            case R.id.jump:
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
        }
    }
}
