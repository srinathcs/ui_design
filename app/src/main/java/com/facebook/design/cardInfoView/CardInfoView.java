package com.facebook.design.cardInfoView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.facebook.design.R;

public class CardInfoView extends LinearLayout {

    private View view;


    public CardInfoView(Context context) {
        this(context,null);
    }

    public CardInfoView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);

    }

    public CardInfoView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater inflater = LayoutInflater.from(context);
        view =inflater.inflate(R.layout.card_info_view,this,true);
    }

    public CardInfoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

    }
}
