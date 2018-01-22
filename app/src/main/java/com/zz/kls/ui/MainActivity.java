package com.zz.kls.ui;

import android.support.v4.app.Fragment;

import com.zz.kls.R;
import com.zz.kls.base.BaseActivity;
import com.zz.kls.base.BaseFragmentActivity;
import com.zz.kls.ui.fragment.StuffFragment;
import com.zz.kls.widget.tabview.TabView;
import com.zz.kls.widget.tabview.TabViewChild;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseFragmentActivity {


    @BindView(R.id.mTabView)
    TabView mTabView;

    Fragment stuffFragment = getFragmentInstance(StuffFragment.class);

    @Override
    protected int setStatusBarColor() {
        return 0;
    }

    @Override
    protected int layoutInit() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindEvent() {
        List<TabViewChild> tabViewChildList=new ArrayList<>();
        TabViewChild tab1 = new TabViewChild(R.drawable.logo,R.drawable.logo,"员工",stuffFragment);
        TabViewChild tab2 = new TabViewChild(R.drawable.logo,R.drawable.logo,"访客",stuffFragment);
        TabViewChild tab3 = new TabViewChild(R.drawable.logo,R.drawable.logo,"监控",stuffFragment);
        tabViewChildList.add(tab1);
        tabViewChildList.add(tab2);
        tabViewChildList.add(tab3);
        mTabView.setTabViewChild(tabViewChildList,getSupportFragmentManager());
    }
}
