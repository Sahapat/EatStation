package com.inspiretail.anint.eatstation.ViewGroups;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.inspiretail.anint.eatstation.R;

public class TextSelectorBarGroup extends FrameLayout {

    private FrameLayout frame_1;
    private FrameLayout frame_2;
    private FrameLayout frame_3;
    private FrameLayout frame_4;

    private TextView txt_frame1;
    private TextView txt_frame2;
    private TextView txt_frame3;
    private TextView txt_frame4;

    private boolean isExpand;

    public TextSelectorBarGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public TextSelectorBarGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public TextSelectorBarGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }

    @TargetApi(21)
    public TextSelectorBarGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }

    public void setClickListener(View.OnClickListener clickListener)
    {
        frame_1.setOnClickListener(clickListener);
        frame_2.setOnClickListener(clickListener);
        frame_3.setOnClickListener(clickListener);
        frame_4.setOnClickListener(clickListener);
    }
    public void setTxt_frame1(String text)
    {
        txt_frame1.setText(text);
    }
    public void setTxt_frame2(String text)
    {
        txt_frame2.setText(text);
    }
    public void setTxt_frame3(String text)
    {
        txt_frame3.setText(text);
    }
    public void setTxt_frame4(String text)
    {
        txt_frame4.setText(text);
    }
    public boolean isExpand()
    {
        return isExpand;
    }
    public void SwitchExpandTxtView()
    {
        if(isExpand)
        {
            frame_2.setVisibility(View.INVISIBLE);
            frame_3.setVisibility(View.INVISIBLE);
            frame_4.setVisibility(View.INVISIBLE);
            isExpand = false;
        }
        else
        {
            frame_2.setVisibility(View.VISIBLE);
            frame_3.setVisibility(View.VISIBLE);
            frame_4.setVisibility(View.VISIBLE);
            isExpand = true;
        }
    }
    private void InitInstance() {
        frame_1 = findViewById(R.id.frame_1);
        frame_2 = findViewById(R.id.frame_2);
        frame_3 = findViewById(R.id.frame_3);
        frame_4 = findViewById(R.id.frame_4);

        txt_frame1 = findViewById(R.id.txt_frame1);
        txt_frame2 = findViewById(R.id.txt_frame2);
        txt_frame3 = findViewById(R.id.txt_frame3);
        txt_frame4 = findViewById(R.id.txt_frame4);
    }

    private void InitInflate() {
        inflate(getContext(), R.layout.txt_selector_bar_group,this);
    }
}
