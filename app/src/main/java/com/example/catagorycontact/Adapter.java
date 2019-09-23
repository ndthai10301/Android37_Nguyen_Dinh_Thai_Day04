package com.example.catagorycontact;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    List<Catagory> lstCatagory;
    @Override
    public int getCount() {
        return lstCatagory.size();
    }

    public Adapter(List<Catagory> lstCatagory) {
        this.lstCatagory = lstCatagory;
    }

    @Override
    public Object getItem(int i) {
        return lstCatagory.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        view=inflater.inflate(R.layout.item_catagory,viewGroup,false);
        TextView tvName= view.findViewById(R.id.tvName);
        TextView tvNote= view.findViewById(R.id.tvnote);
        TextView tvdate=view.findViewById(R.id.tvdate);
        TextView tvPhone= view.findViewById(R.id.tvPhone);
        ImageView imgVideo= view.findViewById(R.id.isVideo);
        ImageView imgquestion= view.findViewById(R.id.imgquestion);
        Catagory catalog= lstCatagory.get(i);
        tvName.setText(catalog.getName());
        tvName.setTypeface(null, Typeface.BOLD);
        tvNote.setText(catalog.getNote());
        tvPhone.setText(catalog.getPhoneNumber());
        imgVideo.setImageResource(R.drawable.iconphone);
        imgquestion.setImageResource(R.drawable.question);

        if(catalog.getVideo())
        {
            imgVideo.setImageResource(R.drawable.icon_camera);
        }
        else
        {
            imgVideo.setImageResource(R.drawable.iconphone);
        }
        if(catalog.getMiscall())
        {
            //tvName.setTextColor(Color.parseColor("#D81B60"));
            tvNote.setText("Cuộc gọi nhỡ");
            tvNote.setTextColor(Color.parseColor("#D81B60"));
            tvNote.setTypeface(null, Typeface.ITALIC);
            imgquestion.setImageResource(R.drawable.sad);
        }
        return view;
    }
}
