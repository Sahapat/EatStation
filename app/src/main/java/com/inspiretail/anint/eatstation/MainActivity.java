package com.inspiretail.anint.eatstation;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitInstance();
    }

    private void InitInstance() {
        btn_profile = findViewById(R.id.btn_profile);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_profile = findViewById(R.id.btn_profile);
        btn_Search =findViewById(R.id.btn_search);
        actionbar_search = findViewById(R.id.actionbar_search);

        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                setOpenSearchBar(false);
                return true;
            }
        });
    }
    private void setOpenSearchBar(boolean status){
        if (status){
            btn_profile.setVisibility(View.INVISIBLE);
            btn_Search.setVisibility(View.INVISIBLE);
            img_eatStation.setVisibility(View.INVISIBLE);
            actionbar_search.setVisibility(View.VISIBLE);
            actionbar_search.setIconified(false);
        }
        else{
            btn_profile.setVisibility(View.VISIBLE);
            btn_Search.setVisibility(View.VISIBLE);
            img_eatStation.setVisibility(View.VISIBLE);
            actionbar_search.setVisibility(View.INVISIBLE);
        }
    }
    View.OnClickListener itemClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case R.id.btn_search:
                    setOpenSearchBar(true);
                    break;
            }
        }
    };
}
