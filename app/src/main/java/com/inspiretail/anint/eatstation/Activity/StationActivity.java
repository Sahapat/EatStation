package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;

import com.inspiretail.anint.eatstation.Markets;
import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.RecommenedMenuGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class StationActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private LinearLayout navigation_bottom;
    private RecommenedMenuGroup recommenedMenuGroup1;
    private RecommenedMenuGroup recommenedMenuGroup2;
    private RecommenedMenuGroup recommenedMenuGroup3;

    private int[] marketIndexs = new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station);

        Intent intent = getIntent();
        marketIndexs = intent.getIntArrayExtra("marketIndexs");
        InitInstance();
        setClickListener();
    }

    private void setClickListener() {
        actionbar_search.setOnCloseListener(onCloseListener);
        btn_Search.setOnClickListener(itemClick);
        recommenedMenuGroup1.setOnClickListener(itemClick);
        recommenedMenuGroup2.setOnClickListener(itemClick);
        recommenedMenuGroup3.setOnClickListener(itemClick);
    }
    private void setViewContent() {
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(Markets.getDetail(marketIndexs[0]).getTrain());
        recommenedMenuGroup1.setMarketindex(0);
        recommenedMenuGroup2.setMarketindex(1);
        recommenedMenuGroup3.setMarketindex(2);
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

        setViewContent();
    }
    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            navigation_bottom.setVisibility(View.INVISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_none));
            actionbar_search.setIconified(false);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            navigation_bottom.setVisibility(View.VISIBLE);
            toolbar.setMainText(Markets.getDetail(marketIndexs[0]).getTrain());
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
