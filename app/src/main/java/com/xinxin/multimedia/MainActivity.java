package com.xinxin.multimedia;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;
import com.xinxin.baselib.arouter.ARouterManager;
import com.xinxin.baselib.arouter.ARouterUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);//恢复原有的样式
        setContentView(R.layout.app_activity_main);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //无参数
                        ARouterUtils.navigationWithNoParams(ARouterManager.MAIN_HOME_ACTIVITY);
                        finish();
                    }
                });
            }
        }).start();
    }
}
