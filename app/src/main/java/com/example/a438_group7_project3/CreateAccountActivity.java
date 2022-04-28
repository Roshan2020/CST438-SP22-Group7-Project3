package com.example.a438_group7_project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.utils.StopLogic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    private Button confirmCreateAccount;
    private Button toLoginButton;
    private EditText createUsernameText;
    private EditText createPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        confirmCreateAccount = findViewById(R.id.buttonConfirmCreateAccount);
        toLoginButton = findViewById(R.id.toLoginButton);
        createUsernameText = findViewById(R.id.editTextCreateUsername);
        createPasswordText = findViewById(R.id.editTextCreatePassword);

        confirmCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CreateAccountActivity.this, "Account Created, " + createUsernameText.getText().toString(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        toLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}