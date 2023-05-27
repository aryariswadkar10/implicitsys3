package com.example.exp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void dial(View V)
    {
        txt = findViewById(R.id.text);
        Uri u = Uri.parse("tel:" + txt.getText().toString());
        Intent i = new Intent(Intent.ACTION_DIAL, u);
        startActivity(i);
    }
}
