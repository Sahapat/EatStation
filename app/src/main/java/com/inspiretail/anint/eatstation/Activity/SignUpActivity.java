package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.inspiretail.anint.eatstation.R;

public class SignUpActivity extends AppCompatActivity {

    private ImageView img_close;
    private Button btn_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        InitInstance();
        setClickListener();
    }

    private void setClickListener() {
        img_close.setOnClickListener(clickListener);
        btn_signup.setOnClickListener(clickListener);
    }

    private void InitInstance() {
        img_close = findViewById(R.id.btn_close);
        btn_signup = findViewById(R.id.btn_sign_up);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_close:
                    finish();
                    break;
                case R.id.btn_sign_up:
                    finish();
                    break;
            }
        }
    };
}
