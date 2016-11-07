package com.branislav.icpc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InforActivity extends AppCompatActivity {
    TextView back_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);
        back_textview=(TextView)findViewById(R.id.back_category_textView);
        back_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(InforActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
