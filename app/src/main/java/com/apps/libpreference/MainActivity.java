package com.apps.libpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.apps.utility.PrefManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.callLib)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    PrefManager.getInstance(MainActivity.this).saveString("test","Your String here");

                    Log.d("Your Entered String",PrefManager.getInstance(MainActivity.this).getString("test"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
