package com.inspiretail.anint.eatstation.ViewGroups;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import com.inspiretail.anint.eatstation.Activity.ProfileActivity;
import com.inspiretail.anint.eatstation.R;
import com.inspiretail.anint.eatstation.CustomViews.TextView_rsu_font;

public class ToolbarGroup extends FrameLayout {

    private TextView_rsu_font txt_main;
    private ImageButton btn_profile;

    public ToolbarGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public ToolbarGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public ToolbarGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }
    @TargetApi(21)
    public ToolbarGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }
    public void setMainText(String text)
    {
        txt_main.setText(text);
    }
    private void InitInstance() {
        txt_main = findViewById(R.id.txt_main);
        btn_profile = findViewById(R.id.btn_left);
        btn_profile.setOnClickListener(listener);
    }
    private void InitInflate() {
        inflate(getContext(),R.layout.m_toolbar_layout,this);
    }

    View.OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if(getContext().getClass().getName() != ProfileActivity.class.getName())
            {
                Intent intent = new Intent(getContext(),ProfileActivity.class);
                getContext().startActivity(intent);
            }
        }
    };
}
