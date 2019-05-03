package com.example.firebasetwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText emailSignIn, passwordSignIN;
    Button signInButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailSignIn = (EditText) findViewById(R.id.signInEmailEditText);
        passwordSignIN = (EditText) findViewById(R.id.signInPasswordEditText);
        signInButton = (Button) findViewById(R.id.signInButton);
        textView = (TextView) findViewById(R.id.signUpTextView);

        signInButton.setOnClickListener(this);
        textView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signInButton: {

                break;
            }
            case R.id.signUpTextView: {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        }
    }
}
