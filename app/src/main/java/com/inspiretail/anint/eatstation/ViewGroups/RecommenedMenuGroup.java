package com.inspiretail.anint.eatstation.ViewGroups;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.inspiretail.anint.eatstation.CustomViews.TextView_rsu_font;
import com.inspiretail.anint.eatstation.R;

public class RecommenedMenuGroup extends FrameLayout {

    private ImageView img_show;
    private TextView_rsu_font header_show;
    private TextView_rsu_font content_show;
    private int marketindex;

    public RecommenedMenuGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public RecommenedMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public RecommenedMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }
    @TargetApi(21)
    public RecommenedMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }
    public void setOpenLocation(int marketindex)
    {
        this.marketindex = marketindex;
    }
    public void setImg_show(Integer img)
    {
        img_show.setImageResource(img);
    }
    public void setHeader_show(String text)
    {
        header_show.setText(text);
    }
    public void setContent_show(String text)
    {
        content_show.setText(text);
    }
    private void InitInstance() {
        img_show = findViewById(R.id.recommened_img_show);
        header_show = findViewById(R.id.recommened_header_show);
        content_show = findViewById(R.id.recommened_content_show);
    }
    private void InitInflate() {
        inflate(getContext(), R.layout.recommened_menu_group,this);
    }

    View.OnClickListener listener = new OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}
