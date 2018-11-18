package com.example.samchriskombo.laptopsecuritysystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Confirmation_list extends AppCompatActivity {
    private Button cmdCheckIn,cmdCheckOut;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_list);

        cmdCheckIn=findViewById(R.id.cmdCheckIn);
        cmdCheckOut=findViewById(R.id.cmdCheckOut);

        cmdCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (v.getContext(),ManualSignActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        cmdCheckOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent (v.getContext(),ManualSignActivity.class);
                v.getContext().startActivity(intent);
            }
        });

    }



}
