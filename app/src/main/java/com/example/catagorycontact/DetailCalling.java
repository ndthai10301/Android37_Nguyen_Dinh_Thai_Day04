package com.example.catagorycontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailCalling extends AppCompatActivity {
    TextView tvname,tvphone,tvNgayThang,tvnote;
    Boolean video,miscall;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_calling);
        setTitle(R.string.init_chitiet);
        Intent intent=getIntent();
        Bundle extras = intent.getExtras();
        tvname=findViewById(R.id.tvFullName);
        tvphone=findViewById(R.id.tvPhone);
        tvnote=findViewById(R.id.tvNote);
        tvNgayThang=findViewById(R.id.tvNgayThang);
        img=findViewById(R.id.imgphone);
        tvname.setText(intent.getStringExtra("name"));
        tvphone.setText(intent.getStringExtra("number"));
        tvphone.setTextColor(Color.parseColor("#008577"));
        tvnote.setText(intent.getStringExtra("note"));
        tvNgayThang.setText(intent.getStringExtra("date"));
        Integer t = extras.getInt("video");
        Integer h=extras.getInt("miscall");
        if(t==1)
        {
            img.setImageResource(R.drawable.icon_camera);
        }
        else
        {
            img.setImageResource(R.drawable.iconphone);
        }
        if(h==1)
        {
            tvnote.setText("Cuộc gọi nhỡ");
            tvnote.setTextColor(Color.parseColor("#D81B60"));
        }

    }
}
