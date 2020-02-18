package com.lowejimmy.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EighthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView label = findViewById(R.id.label);
        label.setText(intent.getStringExtra("com.lowejimmy.lab04.extra.MESSAGE"));

    }

    public void returnToPrevious(View view) {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("com.lowejimmy.lab04.extra.REPLY", "This is my return string!!!");//insert message
        setResult(RESULT_OK, returnIntent);//indicate response was successful
        finish();//close activity and return to main activity
    }
}