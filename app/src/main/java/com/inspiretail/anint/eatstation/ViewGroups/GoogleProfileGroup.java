package com.inspiretail.anint.eatstation.ViewGroups;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.inspiretail.anint.eatstation.R;

public class GoogleProfileGroup extends FrameLayout {

    private TextView tv_top_text;
    private TextView tv_bot_text;
    private TextView tv_center_text;

    private ImageView img_user;
    public GoogleProfileGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public GoogleProfileGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public GoogleProfileGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }

    @TargetApi(21)
    public GoogleProfileGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }
    public void setTv_top_text(String text)
    {
        tv_top_text.setText(text);
    }
    public void setTv_bot_text(String text)
    {
        tv_bot_text.setText(text);
    }
    public void setTv_center_text(String text)
    {
        tv_center_text.setText(text);
    }
    public void setImg_user(Integer imgUri)
    {
        img_user.setImageResource(imgUri);
    }
    private void InitInstance() {
        tv_top_text = findViewById(R.id.tv_top_text);
        tv_bot_text = findViewById(R.id.tv_bot_text);
        tv_center_text =findViewById(R.id.tv_center_text);
        img_user = findViewById(R.id.img_user);
    }

    private void InitInflate() {
        inflate(getContext(), R.layout.google_profile_group,this);
    }
}
