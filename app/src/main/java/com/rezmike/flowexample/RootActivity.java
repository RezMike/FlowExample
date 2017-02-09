package com.rezmike.flowexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import flow.Flow;

public class RootActivity extends AppCompatActivity {

    private FrameLayout mRootFrame;

    @Override
    protected void attachBaseContext(Context newBase) {
        newBase = Flow.configure(newBase, this)
                .defaultKey(new SplashScreen(this))
                .dispatcher(new TreeKeyDispatcher(this))
                .install();
        super.attachBaseContext(newBase);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_root);
        mRootFrame = (FrameLayout) findViewById(R.id.root_frame);
    }

    @Override
    public void onBackPressed() {
        if (getCurrentScreen() != null && !getCurrentScreen().viewBackPressed() && !Flow.get(this).goBack()) {
            super.onBackPressed();
        }
    }

    private IView getCurrentScreen() {
        return (IView) mRootFrame.getChildAt(0);
    }
}
