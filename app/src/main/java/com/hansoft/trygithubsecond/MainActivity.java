package com.hansoft.trygithubsecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        nameEditText = findViewById(R.id.nameEditText);
        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString().trim();
            if (name.equals(""))
            {
                nameEditText.setError("name is empty");
            }

        });
        clearButton = findViewById(R.id.clearButton);
    }

}