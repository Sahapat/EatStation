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

import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.TextSelectorBarGroup;
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

    private LinearLayout fragment_srilom;
    private int srilom_height;
    private LinearLayout fragment_sukrumvit;
    private int sukrumvit_height;
    private LinearLayout fragement_mrt_blue;
    private int mrt_blue_height;
    private LinearLayout fragment_mrt_violet;
    private int mrt_violet_height;
    private FrameLayout container;

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
    private ImageButton btn_talad_bang_yai;
    private ImageButton btn_phra_nung_khlao;

    private TextSelectorBarGroup textSelectorBarGroup;

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
        btn_talad_bang_yai = findViewById(R.id.btn_talad_bang_yai);
        btn_phra_nung_khlao = findViewById(R.id.btn_phra_nong_klao_bridge);
        container = findViewById(R.id.container);
        textSelectorBarGroup = findViewById(R.id.txt_selected_group);
        textSelectorBarGroup.bringToFront();
        srilom_height = fragment_srilom.getMeasuredHeight();
        sukrumvit_height = fragment_sukrumvit.getMeasuredHeight();
        mrt_blue_height = fragement_mrt_blue.getMeasuredHeight();
        mrt_violet_height = fragment_mrt_violet.getMeasuredHeight();

        InitClick();
        setViewContent();
    }

    private void setExpandTxtSelectedBarGroup(boolean status) {
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
        } else if (selected == getString(R.string.station_bts_sukrumvit)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_silom));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_mrt_violet));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.VISIBLE);
            fragement_mrt_blue.setVisibility(View.INVISIBLE);
            fragment_mrt_violet.setVisibility(View.INVISIBLE);
        } else if (selected == getString(R.string.station_mrt_blue)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_bts_silom));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_mrt_violet));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.INVISIBLE);
            fragement_mrt_blue.setVisibility(View.VISIBLE);
            fragment_mrt_violet.setVisibility(View.INVISIBLE);
        } else if (selected == getString(R.string.station_mrt_violet)) {
            textSelectorBarGroup.setTxt_frame1(getString(R.string.station_mrt_violet));
            textSelectorBarGroup.setTxt_frame2(getString(R.string.station_bts_sukrumvit));
            textSelectorBarGroup.setTxt_frame3(getString(R.string.station_mrt_blue));
            textSelectorBarGroup.setTxt_frame4(getString(R.string.station_bts_silom));
            fragment_srilom.setVisibility(View.INVISIBLE);
            fragment_sukrumvit.setVisibility(View.INVISIBLE);
            fragement_mrt_blue.setVisibility(View.INVISIBLE);
            fragment_mrt_violet.setVisibility(View.VISIBLE);
        }
    }

    private void setViewContent() {
        btn_train.setImageResource(home_resource_active);
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(getString(R.string.toolbar_name_station));
        setSelectedText(getString(R.string.station_bts_silom));
    }

    private void InitClick() {
        btn_Search.setOnClickListener(itemClick);
        actionbar_search.setOnCloseListener(onCloseListener);
        btn_dish.setOnClickListener(itemClick);
        btn_nortification.setOnClickListener(itemClick);
        btn_home.setOnClickListener(itemClick);
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
        btn_talad_bang_yai.setOnClickListener(itemClick);
        btn_phra_nung_khlao.setOnClickListener(itemClick);
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
                    intent = new Intent(TrainActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                    break;
                case R.id.btn_nortification:
                    intent = new Intent(TrainActivity.this, NortificationActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                    break;
                case R.id.btn_dish:
                    intent = new Intent(TrainActivity.this, DishActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
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
                    break;
                case R.id.btn_mo_chit:
                    break;
                case R.id.btn_ari:
                    break;
                case R.id.btn_chong_nonsi:
                    break;
                case R.id.btn_sala_dang:
                    break;
                case R.id.btn_national_stadium:
                    break;
                case R.id.btn_bang_sue:
                    break;
                case R.id.btn_phetchaburi:
                    break;
                case R.id.btn_lat_phrao:
                    break;
                case R.id.btn_khlong_bang_phai:
                    break;
                case R.id.btn_talad_bang_yai:
                    break;
                case R.id.btn_phra_nong_klao_bridge:
                    break;
            }
        }
    };
}