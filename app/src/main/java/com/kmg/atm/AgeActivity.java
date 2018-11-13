package com.kmg.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void age(View view){
        EditText edAge = findViewById(R.id.ed_nickname);
        String age = ((EditText)findViewById(R.id.ed_nickname)).getText().toString();
        getSharedPreferences("age" , MODE_PRIVATE)
                .edit()
                .putString("AGE" , age)
                .apply();
    }
}
