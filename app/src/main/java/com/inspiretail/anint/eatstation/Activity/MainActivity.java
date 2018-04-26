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
import com.inspiretail.anint.eatstation.ViewGroups.ViewMenuGroup;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        toolbar.setMainText(getString(R.string.toolbar_name_none));
        recommenedMenuGroup1.setMarketindex(0);
        recommenedMenuGroup2.setMarketindex(1);
        recommenedMenuGroup3.setMarketindex(2);
        recommenedMenuGroup4.setMarketindex(3);
    }

    private void InitClick() {
        actionbar_search.setOnCloseListener(onCloseListener);
        btn_Search.setOnClickListener(itemClick);
        recommenedMenuGroup1.setOnClickListener(itemClick);
        recommenedMenuGroup2.setOnClickListener(itemClick);
        recommenedMenuGroup3.setOnClickListener(itemClick);
        recommenedMenuGroup4.setOnClickListener(itemClick);
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
            }
        }
    };
}
