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
import com.inspiretail.anint.eatstation.Markets;
import com.inspiretail.anint.eatstation.R;
import com.willy.ratingbar.ScaleRatingBar;

public class ViewMenuGroup extends FrameLayout {

    private ImageView img_show;
    private ScaleRatingBar rate_rating;
    private ImageView btn_comment;
    private ImageView btn_heart;
    private TextView_rsu_font txt_market;
    private TextView_rsu_font txt_train;
    private TextView_rsu_font txt_location;
    private TextView_rsu_font txt_time;
    private TextView_rsu_font txt_money;
    private TextView_rsu_font txt_comment;
    private EditText edt_comment;

    private int marketIndex;

    public ViewMenuGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }

    @TargetApi(21)
    public ViewMenuGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }

    private void InitInflate() {
        inflate(getContext(), R.layout.view_menu,this);
    }

    private void InitInstance() {
        img_show = findViewById(R.id.img_show);
        rate_rating = findViewById(R.id.rate_rating);
        btn_comment = findViewById(R.id.btn_comment);
        edt_comment = findViewById(R.id.edt_comment);
        btn_heart = findViewById(R.id.btn_heart);
        txt_market = findViewById(R.id.txt_market_name);
        txt_train = findViewById(R.id.txt_train_name);
        txt_location = findViewById(R.id.txt_location_name);
        txt_time = findViewById(R.id.txt_time_name);
        txt_money = findViewById(R.id.txt_money_name);
        txt_comment = findViewById(R.id.txt_comment);
        marketIndex = 0;
        updateView();
    }
    public void switchLike()
    {
        if(Markets.getDetail(marketIndex).isLike())
        {
            Markets.getDetail(marketIndex).setLike(false);
        }
        else
        {
            Markets.getDetail(marketIndex).setLike(true);
        }
    }
    public void updateView()
    {
        img_show.setImageResource(Markets.getDetail(marketIndex).getImage());
        rate_rating.setRating(Markets.getDetail(marketIndex).getRate());
        txt_market.setText(Markets.getDetail(marketIndex).getName());
        txt_train.setText(Markets.getDetail(marketIndex).getTrain());
        txt_location.setText(Markets.getDetail(marketIndex).getTxt_location());
        txt_time.setText(Markets.getDetail(marketIndex).getTime());
        txt_money.setText(Markets.getDetail(marketIndex).getMoney());
        if(Markets.getDetail(marketIndex).isComment())
        {
            btn_comment.setVisibility(INVISIBLE);
            txt_comment.setVisibility(VISIBLE);
            edt_comment.setVisibility(INVISIBLE);
            txt_comment.setText(Markets.getDetail(marketIndex).getComment());
        }
        else
        {
            btn_comment.setVisibility(VISIBLE);
            txt_comment.setVisibility(INVISIBLE);
            edt_comment.setVisibility(VISIBLE);
        }

        if(Markets.getDetail(marketIndex).isLike())
        {
            btn_heart.setImageResource(R.drawable.ic_heart_enable);
        }
        else
        {
            btn_heart.setImageResource((R.drawable.ic_heart));
        }
    }
}
