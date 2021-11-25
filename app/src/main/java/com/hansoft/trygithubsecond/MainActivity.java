package com.hansoft.trygithubsecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titleTextView;
    private EditText nameEditText;
    private Button submitButton;
    private Button clearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindview();
    }

    private void bindview()
    {
        titleTextView = findViewById(R.id.titleTextView);
        submitButton = findViewById(R.id.submitButton);
        clearButton = findViewById(R.id.clearButton);
    }

}