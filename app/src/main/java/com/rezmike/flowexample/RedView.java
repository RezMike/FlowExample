package com.rezmike.flowexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import flow.Flow;

public class RedView extends LinearLayout implements IView, View.OnClickListener {

    public RedView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        Button redButton = (Button) findViewById(R.id.red_button);
        redButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Flow.get(this).set(new GreenScreen(GreenView.LIGHT));
    }

    @Override
    public boolean viewBackPressed() {
        return false;
    }
}
