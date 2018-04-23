package com.inspiretail.anint.eatstation.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.inspiretail.anint.eatstation.R;

public class NewPasswordActivity extends AppCompatActivity {


    private ImageView btn_close;
    private Button btn_verification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        InitInstance();
        setClickListener();
    }

    private void InitInstance() {
        btn_close = findViewById(R.id.btn_close);
        btn_verification = findViewById(R.id.btn_verification);
    }

    private void setClickListener() {
        btn_close.setOnClickListener(clickListener);
        btn_verification.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
