package com.example.catagorycontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvcat;
    List<Catagory> lstcat;
    Adapter adapter;
    TextView tvTen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(R.string.init_title);
        lvcat = findViewById(R.id.lvCatagory);
        tvTen=findViewById(R.id.tvName);
        lstcat= new ArrayList<>();
        lstcat.add(new Catagory("Người yêu cũ","0909 009 002","20/09/2019","Khách sạn",false,false));
        lstcat.add(new Catagory("Vợ","0989 129 322","20/09/2019","Nhà riêng",true,true));
        lstcat.add(new Catagory("Hùng VPBank A","0904 343536","18/09/2019","Việt Nam",false,false));
        lstcat.add(new Catagory("Vietlott","0936 472561","17/09/2019","Di động",false,false));
        lstcat.add(new Catagory("Đòi nợ thuê","0912 113 114","16/09/2019","Cuộc gọi Video",true,false));
        lstcat.add(new Catagory("Ngân hàng TCB","02253.672.768","12/09/2019","Nhà riêng",false,true));
        lstcat.add(new Catagory("Công An TP","113","10/08/2019","Cảnh sát điều tra",false,false));
        lstcat.add(new Catagory("Sếp","0987 657 345","09/08/2019","Công ty",false,true));
        adapter = new Adapter(lstcat);
        lvcat.setAdapter(adapter);
        lvcat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getBaseContext(),"Cuộc gọi từ: "+ lstcat.get(i).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getBaseContext(),DetailCalling.class);
                //String user_name=tvTen.toString();
                String strTen,strSoDT,strNgayThang,strNote;
                Boolean isVideo,isMiscall;
                strTen=lstcat.get(i).getName();//Lay ten
                strSoDT=lstcat.get(i).getPhoneNumber();//Lay so dien thoai
                strNgayThang=lstcat.get(i).getDate();
                strNote=lstcat.get(i).getNote();
                isVideo=lstcat.get(i).getVideo();
                isMiscall=lstcat.get(i).getMiscall();
                Integer temp=0,mcall=0;
                if(isVideo)
                {
                    temp=1;
                }
                else
                {
                    temp=0;
                }
                if(isMiscall)
                {
                    mcall=1;
                }
                else
                {
                    mcall=0;
                }

                //Put data to intent
                intent.putExtra("name",strTen.toString());
                intent.putExtra("number",strSoDT.toString());
                intent.putExtra("note",strNote.toString());
                intent.putExtra("date",strNgayThang.toString());
                intent.putExtra("video",temp);
                intent.putExtra("miscall",mcall);
                startActivity(intent);
            }
        });

    }
}
