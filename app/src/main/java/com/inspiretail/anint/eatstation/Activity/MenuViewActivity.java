package com.inspiretail.anint.eatstation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.inspiretail.anint.eatstation.Markets;
import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.ViewGroups.ToolbarGroup;
import com.inspiretail.anint.eatstation.ViewGroups.ViewMenuGroup;

public class MenuViewActivity extends AppCompatActivity {

    private ViewMenuGroup view_menu_group;
    private EditText edt_comment;
    private LinearLayout navigation_bottom;
    private ImageButton btn_profile;
    private ImageButton btn_Search;
    private ImageView img_eatStation;
    private ToolbarGroup toolbar;
    private SearchView actionbar_search;
    private int marketIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_view);
        Intent intent = getIntent();
        marketIndex = intent.getIntExtra("marketIndex", 0);
        InitInstance();
        setViewContent();
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
            toolbar.setMainText(Markets.getDetail(marketIndex).getTrain());
            actionbar_search.setVisibility(View.INVISIBLE);
            navigation_bottom.setVisibility(View.VISIBLE);
        }
    }

    private void setViewContent() {
        img_eatStation.setVisibility(View.INVISIBLE);
        toolbar.setMainText(Markets.getDetail(marketIndex).getTrain());
    }

    private void InitInstance() {
        toolbar = findViewById(R.id.app_toolbar);
        view_menu_group = findViewById(R.id.view_menu_group);
        edt_comment = findViewById(R.id.edt_comment);
        btn_profile = findViewById(R.id.btn_left);
        img_eatStation = findViewById(R.id.img_eatstation);
        btn_Search = findViewById(R.id.btn_right);
        actionbar_search = findViewById(R.id.toolbar_search);
        navigation_bottom = findViewById(R.id.navigation_bottom);
        view_menu_group.marketIndex = marketIndex;
        view_menu_group.setClickListener(listener);
        btn_Search.setOnClickListener(listener);
        actionbar_search.setOnCloseListener(onCloseListener);
        edt_comment.setOnClickListener(listener);
        edt_comment.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    view_menu_group.setComment(edt_comment.getText().toString(), true);
                    InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    navigation_bottom.setVisibility(View.VISIBLE);
                    view_menu_group.statusClose(false);
                    return true;
                }
                return false;
            }
        });
        view_menu_group.updateView();
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_right:
                    setOpenSearchBar(true);
                    break;
                case R.id.btn_heart:
                    view_menu_group.switchLike();
                    break;
                case R.id.btn_comment:
                    edt_comment.requestFocus();
                    InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(INPUT_METHOD_SERVICE);
                    imm.showSoftInput(edt_comment, InputMethodManager.SHOW_IMPLICIT);
                    navigation_bottom.setVisibility(View.INVISIBLE);
                    view_menu_group.statusClose(true);
                    break;
                case R.id.view_menu_detail:
                    Intent intent = new Intent(MenuViewActivity.this, MapsActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                    intent.putExtra("indexLocation", marketIndex);
                    intent.putExtra("titleLocation", Markets.getDetail(marketIndex).getName());
                    startActivity(intent);
                    break;
                case R.id.edt_comment:
                    navigation_bottom.setVisibility(View.INVISIBLE);
                    view_menu_group.statusClose(true);
                    break;
                case R.id.btn_close:
                    InputMethodManager i = (InputMethodManager) v.getContext().getSystemService(INPUT_METHOD_SERVICE);
                    i.hideSoftInputFromWindow(v.getWindowToken(), 0);
                    navigation_bottom.setVisibility(View.VISIBLE);
                    view_menu_group.statusClose(false);
                    break;
            }
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    SearchView.OnCloseListener onCloseListener = new SearchView.OnCloseListener() {
        @Override
        public boolean onClose() {
            setOpenSearchBar(false);
            return true;
        }
    };
}
