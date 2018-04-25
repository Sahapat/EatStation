package com.inspiretail.anint.eatstation.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.inspiretail.anint.eatstation.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ImageView img_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        InitInstance();
        setClickListener();
    }

    private void setClickListener() {
        img_close.setOnClickListener(clickListener);
    }

    private void InitInstance() {
        img_close = findViewById(R.id.btn_close);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_close:
                    finish();
                    break;
            }
        }
    };
}