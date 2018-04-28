package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.Toast;

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.TextSelectorBarGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;

public class TrainActivity extends AppCompatActivity {

    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private SearchView actionbar_search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private LinearLayout navigation_bottom;

    private LinearLayout fragment_srilom;
    private LinearLayout fragment_sukrumvit;
    private LinearLayout fragement_mrt_blue;
    private LinearLayout fragment_mrt_violet;
    private FrameLayout container;
    private LinearLayout container_out;

    private ImageButton btn_saphan_buf;
    private ImageButton btn_mo_chit;
    private ImageButton btn_ari;

    private ImageButton btn_nonthri;
    private ImageButton btn_saradang;
    private ImageButton btn_nation_staduim;

    private ImageButton btn_bang_sue;
    private ImageButton btn_petchburi;
    private ImageButton btn_lard_pao;

    private ImageButton btn_bang_khlong_bang_phai;

    private TextSelectorBarGroup textSelectorBarGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        InitInstance();
    }

    private void InitInstance() {
        navigation_bottom = findViewById(R.id.navigation_bottom);
        toolbar = findViewById(R.id.app_toolbar);
        btn_profile = toolbar.findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        actionbar_search = findViewById(R.id.toolbar_search);
        fragment_srilom = findViewById(R.id.fragment_srilom);
        fragment_sukrumvit = findViewById(R.id.fragment_sukrumvit);
        fragement_mrt_blue = findViewById(R.id.fragment_blue_mrt);
        fragment_mrt_violet = findViewById(R.id.fragment_mrt_violet);
        btn_saphan_buf = findViewById(R.id.btn_saphan_khwai);
        btn_mo_chit = findViewById(R.id.btn_mo_chit);
        btn_ari = findViewById(R.id.btn_ari);
        btn_nonthri = findViewById(R.id.btn_chong_nonsi);
        btn_saradang = findViewById(R.id.btn_sala_dang);
        btn_nation_staduim = findViewById(R.id.btn_national_stadium);
        btn_bang_sue = findViewById(R.id.btn_bang_sue);
        btn_petchburi = findViewById(R.id.btn_phetchaburi);
        btn_lard_pao = findViewById(R.id.btn_lat_phrao);
        btn_bang_khlong_bang_phai = findViewById(R.id.btn_khlong_bang_phai);
        container_out = findViewById(R.id.container_out);
        container = findViewById(R.id.container);
        textSelectorBarGroup = findViewById(R.id.txt_selected_group);
        textSelectorBarGroup.bringToFront();
        InitClick();
        setViewContent();
    }
    private void setSelectedText(String selected) {

        if (selected == getString(R.string.station_bts_silom)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_bts_silom));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_mrt_violet));
            fragment_srilom.setVisibility(View.VISIBLE);
            fragment_sukrumvit.setVisibility(View.INVISIBLE);
            fragement_mrt_blue.setVisibility(View.INVISIBLE);
            fragment_mrt_violet.setVisibility(View.INVISIBLE);
            container.getLayoutParams().height = dpToPx(1100);
            container.requestLayout();
            container_out.requestLayout();

        } else if (selected == getString(R.string.station_bts_sukrumvit)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_silom));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_mrt_violet));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.VISIBLE);
            fragement_mrt_blue.setVisibility(View.INVISIBLE);
            fragment_mrt_violet.setVisibility(View.INVISIBLE);
            container.getLayoutParams().height = dpToPx(2000);
            container.requestLayout();
            container_out.requestLayout();
        } else if (selected == getString(R.string.station_mrt_blue)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_bts_silom));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_mrt_violet));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.INVISIBLE);
            fragement_mrt_blue.setVisibility(View.VISIBLE);
            fragment_mrt_violet.setVisibility(View.INVISIBLE);
            container.getLayoutParams().height = dpToPx(1820);
            container.requestLayout();
            container_out.requestLayout();
        } else if (selected == getString(R.string.station_mrt_violet)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_mrt_violet));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_bts_silom));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.INVISIBLE);
            fragement_mrt_blue.setVisibility(View.INVISIBLE);
            fragment_mrt_violet.setVisibility(View.VISIBLE);
            container.getLayoutParams().height = dpToPx(1520);
            container.requestLayout();
            container_out.requestLayout();
        }
    }

    private void setViewContent() {
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(getString(R.string.toolbar_name_station));
        setSelectedText(getString(R.string.station_bts_silom));
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
        textSelectorBarGroup.setClickListener(itemClick);
        btn_saphan_buf.setOnClickListener(itemClick);
        btn_mo_chit.setOnClickListener(itemClick);
        btn_ari.setOnClickListener(itemClick);
        btn_nonthri.setOnClickListener(itemClick);
        btn_saradang.setOnClickListener(itemClick);
        btn_nation_staduim.setOnClickListener(itemClick);
        btn_bang_sue.setOnClickListener(itemClick);
        btn_petchburi.setOnClickListener(itemClick);
        btn_lard_pao.setOnClickListener(itemClick);
        btn_bang_khlong_bang_phai.setOnClickListener(itemClick);
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
            toolbar.setMainText(getString(R.string.toolbar_name_station));
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
            Intent intent;
            int[] marketIndexs;
            switch (v.getId()) {
                case R.id.btn_right:
                    setOpenSearchBar(true);
                    break;
                case R.id.frame_1:
                    if (textSelectorBarGroup.getisExpand()) {
                        setSelectedText(textSelectorBarGroup.getTxt_frame1());
                        textSelectorBarGroup.setExpandTxtView(false);
                    } else {
                        textSelectorBarGroup.setExpandTxtView(true);
                    }
                    break;
                case R.id.frame_2:
                    if (textSelectorBarGroup.getisExpand()) {
                        setSelectedText(textSelectorBarGroup.getTxt_frame2());
                        textSelectorBarGroup.setExpandTxtView(false);
                    } else {
                        textSelectorBarGroup.setExpandTxtView(true);
                    }
                    break;
                case R.id.frame_3:
                    if (textSelectorBarGroup.getisExpand()) {
                        setSelectedText(textSelectorBarGroup.getTxt_frame3());
                        textSelectorBarGroup.setExpandTxtView(false);
                    } else {
                        textSelectorBarGroup.setExpandTxtView(true);
                    }
                    break;
                case R.id.frame_4:
                    if (textSelectorBarGroup.getisExpand()) {
                        setSelectedText(textSelectorBarGroup.getTxt_frame4());
                        textSelectorBarGroup.setExpandTxtView(false);
                    } else {
                        textSelectorBarGroup.setExpandTxtView(true);
                    }
                    break;
                case R.id.btn_saphan_khwai:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs =new int[]{0,1,2};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_mo_chit:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{3,4,5};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_ari:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{6,7,8};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_chong_nonsi:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{9,10,11};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_sala_dang:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{12,13,14};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_national_stadium:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{15,16,17};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_bang_sue:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{27,28,29};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_phetchaburi:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{21,22,23};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_lat_phrao:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{24,25,26};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
                case R.id.btn_khlong_bang_phai:
                    intent = new Intent(TrainActivity.this,StationActivity.class);
                    marketIndexs = new int[]{18,19,20};
                    intent.putExtra("marketIndexs",marketIndexs);
                    startActivity(intent);
                    break;
            }
        }
    };
    public int dpToPx(int dp) {
        float density = getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }
}
