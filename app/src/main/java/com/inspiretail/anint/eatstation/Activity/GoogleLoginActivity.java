package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.GoogleProfileGroup;

public class GoogleLoginActivity extends AppCompatActivity {

    private GoogleProfileGroup profileGroup1;
    private GoogleProfileGroup profileGroup2;
    private GoogleProfileGroup profileGroup3;
    private GoogleProfileGroup profileGroup4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_login);

        InitInstance();
        setViewContent();
        setClickListener();
    }

    private void setClickListener() {
        profileGroup1.setOnClickListener(clickListener);
        profileGroup2.setOnClickListener(clickListener);
        profileGroup3.setOnClickListener(clickListener);
    }

    private void setViewContent() {
        profileGroup1.setImg_user(R.drawable.ic_google_profile_1);
        profileGroup1.setTv_top_text(getString(R.string.google_user1_name));
        profileGroup1.setTv_bot_text(getString(R.string.google_user1_mail));
        profileGroup1.setTv_center_text(getString(R.string.none));

        profileGroup2.setImg_user(R.drawable.ic_google_profile_2);
        profileGroup2.setTv_top_text(getString(R.string.google_user2_name));
        profileGroup2.setTv_bot_text(getString(R.string.google_user2_mail));
        profileGroup2.setTv_center_text(getString(R.string.none));

        profileGroup3.setImg_user(R.drawable.ic_google_profile_3);
        profileGroup3.setTv_top_text(getString(R.string.google_user3_name));
        profileGroup3.setTv_bot_text(getString(R.string.google_user3_mail));
        profileGroup3.setTv_center_text(getString(R.string.none));

        profileGroup4.setImg_user(R.drawable.ic_google_profile_none);
        profileGroup4.setTv_top_text(getString(R.string.none));
        profileGroup4.setTv_bot_text(getString(R.string.none));
        profileGroup4.setTv_center_text(getString(R.string.google_user_none));

    }

    private void InitInstance() {
        profileGroup1 =findViewById(R.id.profile_group1);
        profileGroup2 =findViewById(R.id.profile_group2);
        profileGroup3 =findViewById(R.id.profile_group3);
        profileGroup4 =findViewById(R.id.profile_group4);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(GoogleLoginActivity.this,MainActivity.class);
            intent.putExtra("isFromLogin",true);
            startActivity(intent);
        }
    };
}
