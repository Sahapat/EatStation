package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.SliderImageViewPagerAdapter;
import com.inspiretail.anint.eatstation.ViewGroups.RecommenedMenuGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private ViewPager viewPager_main;
    private RecommenedMenuGroup recommenedMenuGroup1;
    private RecommenedMenuGroup recommenedMenuGroup2;
    private RecommenedMenuGroup recommenedMenuGroup3;
    private RecommenedMenuGroup recommenedMenuGroup4;
    private LinearLayout navigation_bottom;

    private Intent intent;

    private Integer home_resource_active = R.drawable.ic_home_active;
    private ImageButton btn_home;
    private ImageButton btn_nortification;
    private ImageButton btn_train;
    private ImageButton btn_dish;

    private boolean isFromLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        isFromLogin = intent.getBooleanExtra("isFromLogin",false);
        InitInstance();
        InitViewPager();
    }

    private void InitViewPager() {
        viewPager_main = findViewById(R.id.viewpager_main);
        SliderImageViewPagerAdapter imageViewPagerAdapter = new SliderImageViewPagerAdapter(MainActivity.this);
        viewPager_main.setAdapter(imageViewPagerAdapter);
    }

    private void InitInstance() {
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        viewPager_main = findViewById(R.id.viewpager_main);
        actionbar_search = findViewById(R.id.toolbar_search);
        recommenedMenuGroup1 = findViewById(R.id.menu_group1);
        recommenedMenuGroup2 = findViewById(R.id.menu_group2);
        recommenedMenuGroup3 = findViewById(R.id.menu_group3);
        recommenedMenuGroup4 = findViewById(R.id.menu_group4);
        navigation_bottom = findViewById(R.id.navigation_bottom);
        btn_home = findViewById(R.id.btn_home);
        btn_nortification = findViewById(R.id.btn_nortification);
        btn_train = findViewById(R.id.btn_train);
        btn_dish = findViewById(R.id.btn_dish);

        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        btn_home.setImageResource(home_resource_active);
        toolbar.setMainText(getString(R.string.toolbar_name_none));
        recommenedMenuGroup1.setImg_show(R.drawable.img_menu1);
        recommenedMenuGroup1.setHeader_show(getString(R.string.menu_koi_the_thailand));
        recommenedMenuGroup1.setContent_show(getString(R.string.detail_location_koi_the_thailand));
        recommenedMenuGroup2.setImg_show(R.drawable.img_menu2);
        recommenedMenuGroup2.setHeader_show(getString(R.string.menu_bella_cas));
        recommenedMenuGroup2.setContent_show(getString(R.string.detail_location_bella_cas));
        recommenedMenuGroup3.setImg_show(R.drawable.img_menu3);
        recommenedMenuGroup3.setHeader_show(getString(R.string.menu_yentafour));
        recommenedMenuGroup3.setContent_show(getString(R.string.detail_location_yentafour));
        recommenedMenuGroup4.setImg_show(R.drawable.img_menu4);
        recommenedMenuGroup4.setHeader_show(getString(R.string.menu_cafe_de_fin));
        recommenedMenuGroup4.setContent_show(getString(R.string.detail_location_cafe_de_fin));
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
        btn_train.setOnClickListener(itemClick);
        btn_nortification.setOnClickListener(itemClick);
        btn_dish.setOnClickListener(itemClick);
    }

    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            img_eatStation.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            navigation_bottom.setVisibility(View.INVISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_none));
            actionbar_search.setIconified(false);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            img_eatStation.setVisibility(View.VISIBLE);
            navigation_bottom.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_none));
            actionbar_search.setVisibility(View.INVISIBLE);
        }
    }


    SearchView.OnCloseListener onCloseListener = new SearchView.OnCloseListener() {
        @Override
        public boolean onClose() {
            setOpenSearchBar(false);
            return true;
        }
    };
    View.OnClickListener itemClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_right:
                    setOpenSearchBar(true);
                    break;
                case R.id.btn_dish:
                    intent = new Intent(MainActivity.this,DishActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_nortification:
                    intent = new Intent(MainActivity.this,NortificationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_train:
                    intent = new Intent(MainActivity.this,TrainActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(isFromLogin)
        {
            finishAffinity();
        }
    }
}
