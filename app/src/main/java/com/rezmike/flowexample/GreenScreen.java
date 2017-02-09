package com.rezmike.flowexample;

@Screen(R.layout.screen_green)
public class GreenScreen {

    private int mState;

    public GreenScreen(int state) {
        mState = state;
    }

    public int getState() {
        return mState;
    }

    public void setState(int state) {
        mState = state;
    }
}
