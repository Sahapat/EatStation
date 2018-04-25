package com.inspiretail.anint.eatstation.ViewGroups;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;

import com.inspiretail.anint.eatstation.CustomViews.TextView_rsu_font;

public class ViewMenuGroup extends FrameLayout {

    private ImageView img_show;
    private RatingBar rate_rating;
    private ImageView btn_comment;
    private ImageView btn_heart;
    private TextView_rsu_font txt_market;
    private TextView_rsu_font txt_train;
    private TextView_rsu_font txt_location;
    private TextView_rsu_font txt_time;
    private TextView_rsu_font txt_money;
    private TextView_rsu_font txt_comment;
    private EditText edt_comment;

    public ViewMenuGroup(@NonNull Context context) {
        super(context);
    }

    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
