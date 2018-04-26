package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.inspiretail.anint.eatstation.R;

public class FacebookLoginActivity extends AppCompatActivity {

    private Button btn_next;
    private Button btn_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_login);

        InitInstance();
        setClickListenner();
    }

    private void setClickListenner() {
        btn_next.setOnClickListener(clickListener);
        btn_cancel.setOnClickListener(clickListener);
    }

    private void InitInstance() {
        btn_next = findViewById(R.id.btn_next);
        btn_cancel = findViewById(R.id.btn_cancel);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_next:
                    Intent intent = new Intent(FacebookLoginActivity.this,MainActivity.class);
                    intent.putExtra("isFromLogin",true);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                    break;
                case R.id.btn_cancel:
                    finish();
                    break;
            }
        }
    };
}
