package com.example.android1_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.ClosedSubscriberGroupInfo;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name =  findViewById(R.id.login);
        password =  findViewById(R.id.pass);
        button =  findViewById(R.id.signin);
        Log.e( "onCreate:","LogCat");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e( "onClick:","LOGG");
                Toast toast = Toast.makeText(getApplicationContext(),"Вы вошли в аккаунт "+name.getText().toString(),Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }
}


