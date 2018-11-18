package com.example.samchriskombo.laptopsecuritysystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Confirmation_list extends AppCompatActivity {
    private Button cmdConfirmation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_list);

        cmdConfirmation=findViewById(R.id.cmdConfirm);

    }



}
