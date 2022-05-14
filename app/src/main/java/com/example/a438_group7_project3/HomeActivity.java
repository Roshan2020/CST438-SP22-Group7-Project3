package com.example.a438_group7_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class HomeActivity extends AppCompatActivity {

    private ImageView mainImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainImageView = findViewById(R.id.imageView);
        String url = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.get()
                .load(url)
                .resize(400,400)
                .centerCrop()
                .error(R.drawable.captionit_logo_black_crop)
                .into(mainImageView);


//        Picasso picasso = new Picasso.Builder(this)
//                .listener(new Picasso.Listener() {
//                    @Override
//                    public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
//                        Log.d("picasso", exception.toString());
//                    }
//                })
//                .build();
//
//        picasso.load("https://i.imgur.com/DvpvklR.png")
//                .into(mainImageView);
    }
}