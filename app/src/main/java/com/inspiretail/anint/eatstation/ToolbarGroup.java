package com.inspiretail.anint.eatstation;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ToolbarGroup extends FrameLayout {
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

    private void InitInstance() {
    }

    private void InitInflate() {
        inflate(getContext(),R.layout.m_toolbar_layout,this);
    }
}
