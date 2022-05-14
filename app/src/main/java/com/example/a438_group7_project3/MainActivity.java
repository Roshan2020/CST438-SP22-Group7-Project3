package com.example.a438_group7_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Button toLoginActivity;
    private Button toCreateAccount;
    private ImageView mainImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toLoginActivity = findViewById(R.id.buttonLogin);
        toCreateAccount = findViewById(R.id.createAccountButton);
        mainImageView = findViewById(R.id.imageView);

        //Load image into imageView
        String url = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.get()
                .load(url)
                .resize(400,400)
                .centerCrop()
                .error(R.drawable.captionit_logo_black_crop)
                .into(mainImageView);

        toLoginActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        toCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}