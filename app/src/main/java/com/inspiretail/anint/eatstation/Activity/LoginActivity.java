package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.inspiretail.anint.eatstation.R;

public class LoginActivity extends AppCompatActivity {

    private Button btn_signin;
    private Button btn_facebook_signin;
    private Button btn_google_signin;

    private TextView tv_lost;
    private TextView tv_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        InitInstance();
        setClickListener();
    }

    private void setClickListener() {
        btn_signin.setOnClickListener(clickListener);
        btn_facebook_signin.setOnClickListener(clickListener);
        btn_google_signin.setOnClickListener(clickListener);
        tv_lost.setOnClickListener(clickListener);
        tv_signup.setOnClickListener(clickListener);
    }

    private void InitInstance() {
        btn_signin = findViewById(R.id.btn_sign_in);
        btn_facebook_signin = findViewById(R.id.btn_login_facebook);
        btn_google_signin = findViewById(R.id.btn_login_google);
        tv_lost = findViewById(R.id.tv_lost);
        tv_signup = findViewById(R.id.tv_signup);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId())
            {
                case R.id.btn_sign_in:
                    intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("isFromLogin",true);
                    startActivity(intent);
                    break;
                case R.id.btn_login_facebook:
                    intent = new Intent(LoginActivity.this,FacebookLoginActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_login_google:
                    intent = new Intent(LoginActivity.this,GoogleLoginActivity.class);
                    startActivity(intent);
                    break;
                case R.id.tv_lost:
                    intent = new Intent(LoginActivity.this,ForgotPasswordActivity.class);
                    startActivity(intent);
                    break;
                case R.id.tv_signup:
                    intent = new Intent(LoginActivity.this,SignUpActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
