package com.example.comp1786lecture2nameentry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NameDisplay extends AppCompatActivity {
    public static final String NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_display);

        TextView mGreeting = (TextView) findViewById(R.id.showName);

        Bundle extras = getIntent().getExtras();

        if (extras == null) return;
        String name = extras.getString(NAME);
        if (name.isEmpty()) {
            mGreeting.setText("The name is empty");
            return;
        }
        mGreeting.setText((getString(R.string.greeting) + " " + name));

    }
}