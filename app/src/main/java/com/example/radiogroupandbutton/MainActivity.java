package com.example.radiogroupandbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import android.widget.RadioGroup;

import com.example.radiogroupandbutton.R;
import com.example.radiogroupandbutton.R.id;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        RadioGroup group = findViewById(R.id.group);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radiobutton1:
                        imageView.setImageResource(R.drawable.image1);
                        break;
                    case R.id.radiobutton2:
                        imageView.setImageResource(R.drawable.image2);
                        break;
                    case R.id.radiobutton3:
                        imageView.setImageResource(R.drawable.image3);
                        break;
                    case R.id.radiobutton4:
                        imageView.setImageResource(R.drawable.image4);
                        break;
                    case R.id.radiobutton5:
                        imageView.setImageResource(R.drawable.image5);
                        break;

                }
            }
        });

    }
}