package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.inspiretail.anint.eatstation.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    private ImageView img_close;
    private Button btn_confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        InitInstance();
        setClickListener();
    }

    private void setClickListener() {
        img_close.setOnClickListener(clickListener);
        btn_confirm.setOnClickListener(clickListener);
    }

    private void InitInstance() {
        img_close = findViewById(R.id.btn_close);
        btn_confirm = findViewById(R.id.btn_confirm);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()) {
                case R.id.btn_close:
                    finish();
                    break;
                case R.id.btn_confirm:
                    intent = new Intent(ForgotPasswordActivity.this, NewPasswordActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                    break;
            }
        }
    };
}
