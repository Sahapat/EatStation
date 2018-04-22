package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class TrainActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;

    private Integer home_resource_active = R.drawable.ic_train_active;
    private ImageButton btn_home;
    private ImageButton btn_nortification;
    private ImageButton btn_train;
    private ImageButton btn_dish;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        InitInstance();
    }

    private void InitInstance() {
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        actionbar_search = findViewById(R.id.toolbar_search);
        btn_home = findViewById(R.id.btn_home);
        btn_nortification = findViewById(R.id.btn_nortification);
        btn_train = findViewById(R.id.btn_train);
        btn_dish = findViewById(R.id.btn_dish);
        InitClick();
        setViewContent();
    }

    private void setViewContent() {
        btn_train.setImageResource(home_resource_active);
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(getString(R.string.toolbar_name_station));
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
        btn_dish.setOnClickListener(itemClick);
        btn_nortification.setOnClickListener(itemClick);
        btn_home.setOnClickListener(itemClick);
    }

    private void setOpenSearchBar(boolean status) {
        if (status) {
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_none));
            actionbar_search.setIconified(false);
        } else {
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            toolbar.setMainText(getString(R.string.toolbar_name_station));
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
                case R.id.btn_home:
                    intent = new Intent(TrainActivity.this,MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_nortification:
                    intent = new Intent(TrainActivity.this,NortificationActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn_dish:
                    intent = new Intent(TrainActivity.this,DishActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
