package com.android.nam19.baitapbuoi61;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mBtn;
    TextView mTvResult;
    EditText mEdtA, mEdtB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //*****************
        mBtn = (Button) findViewById(R.id.btn_start);
        mEdtA = (EditText)findViewById(R.id.edt_a);
        mEdtB = (EditText)findViewById(R.id.edt_b);
        mTvResult = (TextView)findViewById(R.id.tvRs);

        //***************************
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("a", Integer.parseInt(mEdtA.getText().toString()));
                bundle.putInt("b", Integer.parseInt(mEdtB.getText().toString()));
                i.putExtras(bundle);
                startActivityForResult(i, 1111);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data!=null){
            mTvResult.setText((data.getIntExtra("myResult",0))+"");
        }

    }
}
