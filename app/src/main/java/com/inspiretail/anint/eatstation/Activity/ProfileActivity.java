package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.RecommenedMenuGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class ProfileActivity extends AppCompatActivity {
    private ImageButton btn_profile;
    private ImageButton btn_setting;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private RecommenedMenuGroup recommenedMenuGroup1;
    private RecommenedMenuGroup recommenedMenuGroup2;
    private RecommenedMenuGroup recommenedMenuGroup3;
    private RecommenedMenuGroup recommenedMenuGroup4;
    private LinearLayout navigation_bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        InitInstance();
    }

    private void InitInstance() {
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        recommenedMenuGroup1 = findViewById(R.id.menu_group1);
        recommenedMenuGroup2 = findViewById(R.id.menu_group2);
        recommenedMenuGroup3 = findViewById(R.id.menu_group3);
        recommenedMenuGroup4 = findViewById(R.id.menu_group4);
        btn_setting = findViewById(R.id.btn_right);
        navigation_bottom = findViewById(R.id.navigation_bottom);

        InitClick();
        setViewContent();
    }
    private void setViewContent() {
        toolbar.setMainText("Profile");
        btn_profile.setImageResource(R.drawable.ic_back);
        btn_setting.setImageResource(R.drawable.ic_settting);
        img_eatStation.setVisibility(View.INVISIBLE);
        recommenedMenuGroup1.setMarketindex(0);
        recommenedMenuGroup2.setMarketindex(1);
        recommenedMenuGroup3.setMarketindex(2);
        recommenedMenuGroup4.setMarketindex(3);
    }
    private void InitClick() {
        recommenedMenuGroup1.setOnClickListener(itemClick);
        recommenedMenuGroup2.setOnClickListener(itemClick);
        recommenedMenuGroup3.setOnClickListener(itemClick);
        recommenedMenuGroup4.setOnClickListener(itemClick);
        btn_profile.setOnClickListener(itemClick);
        btn_setting.setOnClickListener(itemClick);
    }
    View.OnClickListener itemClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_left:
                    finish();
                    break;
                case R.id.btn_right:
                    Intent intent = new Intent(ProfileActivity.this,NewPasswordActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
