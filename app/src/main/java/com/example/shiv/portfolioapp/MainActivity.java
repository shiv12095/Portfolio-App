package com.example.shiv.portfolioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickOnButton(View view){
        Button button = (Button)view;
        String text = getResources().getString(R.string.toast_common_text);
        Toast.makeText(getApplicationContext(), text + " " + button.getText().toString().toLowerCase() ,
                Toast.LENGTH_SHORT).show();
    }
}
