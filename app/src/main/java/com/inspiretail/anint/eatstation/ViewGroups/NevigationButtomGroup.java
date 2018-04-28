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

import com.inspiretail.anint.eatstation.Activity.DishActivity;
import com.inspiretail.anint.eatstation.Activity.MainActivity;
import com.inspiretail.anint.eatstation.Activity.NortificationActivity;
import com.inspiretail.anint.eatstation.Activity.StationActivity;
import com.inspiretail.anint.eatstation.Activity.TrainActivity;
import com.inspiretail.anint.eatstation.R;

public class NevigationButtomGroup extends FrameLayout {

    private ImageButton btn_home;
    private ImageButton btn_nortification;
    private ImageButton btn_train;
    private ImageButton btn_dish;

    private String onClassName;

    public NevigationButtomGroup(@NonNull Context context) {
        super(context);
        InitInflate();
        InitInstance();
    }

    public NevigationButtomGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        InitInflate();
        InitInstance();
    }

    public NevigationButtomGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        InitInflate();
        InitInstance();
    }

    @TargetApi(21)
    public NevigationButtomGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        InitInflate();
        InitInstance();
    }

    private void InitInstance() {
        btn_home = findViewById(R.id.btn_home);
        btn_nortification = findViewById(R.id.btn_nortification);
        btn_train = findViewById(R.id.btn_train);
        btn_dish = findViewById(R.id.btn_dish);

        setBtnActive();

        btn_home.setOnClickListener(itemClick);
        btn_nortification.setOnClickListener(itemClick);
        btn_train.setOnClickListener(itemClick);
        btn_dish.setOnClickListener(itemClick);

    }
    private void setBtnActive()
    {
        if(onClassName == MainActivity.class.getName())
        {
            btn_home.setImageResource(R.drawable.ic_home_active);
        }
        else if(onClassName == NortificationActivity.class.getName())
        {
            btn_nortification.setImageResource(R.drawable.ic_nortification_active);
        }
        else if(onClassName == DishActivity.class.getName())
        {
            btn_dish.setImageResource(R.drawable.ic_dish_active);
        }
        else if(onClassName == TrainActivity.class.getName())
        {
            btn_train.setImageResource(R.drawable.ic_train_active);
        }
        else{
            btn_train.setImageResource(R.drawable.ic_train_active);
        }
    }
    private void InitInflate() {
        inflate(getContext(), R.layout.navigation_bottom, this);
        onClassName = getContext().getClass().getName();
    }

    View.OnClickListener itemClick = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_home:
                    if (onClassName != MainActivity.class.getName()) {
                        Intent intent = new Intent(getContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        getContext().startActivity(intent);
                    }
                    break;
                case R.id.btn_nortification:
                    if (onClassName != NortificationActivity.class.getName()) {
                        Intent intent = new Intent(getContext(), NortificationActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        getContext().startActivity(intent);
                    }
                    break;
                case R.id.btn_train:
                    if (onClassName != TrainActivity.class.getName()) {
                        Intent intent = new Intent(getContext(), TrainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        getContext().startActivity(intent);
                    }
                    break;
                case R.id.btn_dish:
                    if (onClassName != DishActivity.class.getName()) {
                        Intent intent = new Intent(getContext(), DishActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                        getContext().startActivity(intent);
                    }
                    break;
            }
        }
    };
}
