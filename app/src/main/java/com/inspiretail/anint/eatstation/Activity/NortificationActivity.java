package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.inspiretail.anint.eatstation.CustomViews.TextView_rsu_font;
import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.RecommenedMenuGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class NortificationActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private LinearLayout navigation_bottom;
    private TextView_rsu_font txt_nearby;
    private TextView_rsu_font txt_like;
    private boolean isSelectNearby;
    private RecommenedMenuGroup recommenedMenuGroup1;
    private RecommenedMenuGroup recommenedMenuGroup2;
    private RecommenedMenuGroup recommenedMenuGroup3;
    private RecommenedMenuGroup recommenedMenuGroup4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nortification);
        isSelectNearby = true;
        InitInstance();
    }

    private void InitInstance() {
        txt_nearby = findViewById(R.id.txt_nearby);
        txt_like = findViewById(R.id.txt_like);
        navigation_bottom = findViewById(R.id.navigation_bottom);
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        actionbar_search = findViewById(R.id.toolbar_search);
        recommenedMenuGroup1 = findViewById(R.id.menu_group1);
        recommenedMenuGroup2 = findViewById(R.id.menu_group2);
        recommenedMenuGroup3 = findViewById(R.id.menu_group3);
        recommenedMenuGroup4 = findViewById(R.id.menu_group4);
        updateSelect();
        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        toolbar.setMainText(getString(R.string.toolbar_name_notification));
        img_eatStation.setVisibility(View.INVISIBLE);
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
        txt_nearby.setOnClickListener(itemClick);
        txt_like.setOnClickListener(itemClick);
    }
    private void updateSelect()
    {
        if(isSelectNearby)
        {
            txt_nearby.setBackgroundColor(Color.TRANSPARENT);
            txt_like.setBackgroundColor(Color.WHITE);
            recommenedMenuGroup1.setMarketindex(0);
            recommenedMenuGroup2.setMarketindex(1);
            recommenedMenuGroup3.setMarketindex(2);
            recommenedMenuGroup4.setMarketindex(3);
        }
        else
        {
            txt_nearby.setBackgroundColor(Color.WHITE);
            txt_like.setBackgroundColor(Color.TRANSPARENT);
            recommenedMenuGroup1.setMarketindex(4);
            recommenedMenuGroup2.setMarketindex(5);
            recommenedMenuGroup3.setMarketindex(6);
            recommenedMenuGroup4.setMarketindex(7);
        }
    }
    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_none));
            actionbar_search.setIconified(false);
            navigation_bottom.setVisibility(View.INVISIBLE);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_notification));
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
                case R.id.txt_nearby:
                    isSelectNearby = true;
                    updateSelect();
                    break;
                case R.id.txt_like:
                    isSelectNearby = false;
                    updateSelect();
                    break;
            }
        }
    };
}
