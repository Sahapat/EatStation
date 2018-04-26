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

public class DishActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private RecommenedMenuGroup recommenedMenuGroup1;
    private RecommenedMenuGroup recommenedMenuGroup2;
    private RecommenedMenuGroup recommenedMenuGroup3;
    private RecommenedMenuGroup recommenedMenuGroup4;
    private RecommenedMenuGroup recommenedMenuGroup5;
    private RecommenedMenuGroup recommenedMenuGroup6;

    private LinearLayout navigation_bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);

        InitInstance();
    }

    private void InitInstance() {
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        actionbar_search = findViewById(R.id.toolbar_search);
        navigation_bottom = findViewById(R.id.navigation_bottom);
        recommenedMenuGroup1 = findViewById(R.id.menu_group1);
        recommenedMenuGroup2 = findViewById(R.id.menu_group2);
        recommenedMenuGroup3 = findViewById(R.id.menu_group3);
        recommenedMenuGroup4 = findViewById(R.id.menu_group4);
        recommenedMenuGroup5 = findViewById(R.id.menu_group5);
        recommenedMenuGroup6 = findViewById(R.id.menu_group6);
        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(getString(R.string.toolbar_name_restuarant));
        recommenedMenuGroup1.setMarketindex(5);
        recommenedMenuGroup2.setMarketindex(6);
        recommenedMenuGroup3.setMarketindex(3);
        recommenedMenuGroup4.setMarketindex(4);
        recommenedMenuGroup5.setMarketindex(8);
        recommenedMenuGroup6.setMarketindex(9);
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
    }

    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            toolbar.setMainText("");
            actionbar_search.setIconified(false);
            navigation_bottom.setVisibility(View.INVISIBLE);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_restuarant));
            actionbar_search.setVisibility(View.INVISIBLE);
            navigation_bottom.setVisibility(View.VISIBLE);
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
