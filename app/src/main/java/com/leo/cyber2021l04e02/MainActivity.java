package com.leo.cyber2021l04e02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final int[] IMG_RES_IDS = new int[] { R.drawable.img_1, R.drawable.img_2, R.drawable.img_3 };
    private static final int[] BTN_RES_IDS = new int[] { R.drawable.btn_1, R.drawable.btn_2, R.drawable.btn_3 };

    private Random rnd;
    private ImageView imgView;
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rnd = new Random();
        imgView = findViewById(R.id.imgView);
        btn = findViewById(R.id.btn);
    }

    public void onClick_btn(View view) {
        int index = rnd.nextInt(3);
        imgView.setImageResource(IMG_RES_IDS[index]);
        btn.setImageResource(BTN_RES_IDS[index]);
    }
}
