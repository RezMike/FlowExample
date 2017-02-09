package com.rezmike.flowexample;

import flow.ClassKey;

@Screen(R.layout.screen_splash)
public class SplashScreen extends ClassKey {

    private RootActivity mActivity;

    public SplashScreen(RootActivity activity) {
        mActivity = activity;
    }

    public RootActivity getRootActivity() {
        return mActivity;
    }
}
