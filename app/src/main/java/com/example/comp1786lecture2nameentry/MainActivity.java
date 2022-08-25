package com.example.comp1786lecture2nameentry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private EditText nameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = (EditText) findViewById(R.id.name);
    }

    public void handleButtonClick(View view){
        String strName = nameText.getText().toString();

        Intent i = new Intent(this, NameDisplay.class);

        i.putExtra(NameDisplay.NAME, strName);

        startActivity(i);
    }

    public void handleButtonClick2(View view){
        String strName = "I told you not to press me";

        Intent i = new Intent(this, NameDisplay.class);

        i.putExtra(NameDisplay.NAME, strName );

        startActivity(i);
    }
}