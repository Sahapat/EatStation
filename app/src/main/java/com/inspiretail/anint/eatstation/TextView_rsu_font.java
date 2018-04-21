package com.inspiretail.anint.eatstation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextView_rsu_font extends android.support.v7.widget.AppCompatTextView {

    private String font_style;

    public TextView_rsu_font(Context context) {
        super(context);
    }

    public TextView_rsu_font(Context context, AttributeSet attrs) {
        super(context, attrs);
        initWithAttrs(attrs, 0, 0);
    }

    public TextView_rsu_font(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initWithAttrs(attrs, defStyleAttr, 0);
    }

    private void initWithAttrs(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs, R.styleable.TextView_rsu_font, defStyleAttr, defStyleRes);
        try {
            font_style = a.getString(R.styleable.TextView_rsu_font_font_style);
        } finally {
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setFont_style();
    }

    private void setFont_style() {
        Typeface regular = Typeface.createFromAsset(getContext().getAssets(), "fonts/rsu_regular.ttf");
        Typeface bold = Typeface.createFromAsset(getContext().getAssets(), "fonts/rsu_bold.ttf");
        Typeface light = Typeface.createFromAsset(getContext().getAssets(), "fonts/rsu_light.ttf");

        switch (font_style) {
            case "regular":
                setTypeface(regular);
                break;
            case "bold":
                setTypeface(bold);
                break;
            case "light":
                setTypeface(light);
                break;
        }
    }
}
