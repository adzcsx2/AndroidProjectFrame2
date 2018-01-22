package com.zz.kls.ui;

import com.zz.kls.R;
import com.zz.kls.base.BaseActivity;

import hoyn.eventbusl.EventBus;
import hoyn.eventbusl.Subscribe;

/**
 * Created by Hoyn on 17/3/29.
 */

public class TestActivity extends BaseActivity{

    @Override
    protected int setStatusBarColor() {
        return 0;
    }

    @Override
    protected int layoutInit() {
        return R.layout.activity_main2;
    }

    @Override
    protected void bindEvent() {
    }
}
