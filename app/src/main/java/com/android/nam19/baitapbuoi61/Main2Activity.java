package com.android.nam19.baitapbuoi61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button mBtn1, mBtn2, mBtn3, mBtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //**********************
        mBtn1 = (Button)findViewById(R.id.btn_1);
        mBtn2 = (Button)findViewById(R.id.btn_2);
        mBtn3 = (Button)findViewById(R.id.btn_3);
        mBtn4 = (Button)findViewById(R.id.btn_4);
        //************************
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
        mBtn4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Bundle bundle = getIntent().getExtras();
        int a = bundle.getInt("a");
        int b = bundle.getInt("b");
        switch (v.getId()){
            case R.id.btn_1:
                //cong
                MyResultAction(a+b);
                break;
            case R.id.btn_2:
                //tru
                MyResultAction(a-b);
                break;
            case R.id.btn_3:
                //nhan
                MyResultAction(a*b);
                break;
            case R.id.btn_4:
                //chia
                MyResultAction(a/b);
                break;
        }
    }
    public void MyResultAction(int result){
        Intent i = new Intent();
        i.putExtra("myResult", result);
        setResult(100,i);
        finish();
    }
}
