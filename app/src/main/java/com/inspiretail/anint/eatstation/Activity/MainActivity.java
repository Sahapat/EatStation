package com.inspiretail.anint.eatstation.Activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;

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

        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        toolbar.setMainText("");
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
    }

    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            img_eatStation.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            actionbar_search.setIconified(false);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            img_eatStation.setVisibility(View.VISIBLE);
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
