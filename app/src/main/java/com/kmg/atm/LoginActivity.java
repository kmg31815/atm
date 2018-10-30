package com.kmg.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        String userid = ((EditText)findViewById(R.id.ed_userid)).getText().toString();
        String password = ((EditText)findViewById(R.id.ed_password)).getText().toString();
        if("Jack".equals(userid) && "1234".equals(password)){
            finish();
        }
    }
}
