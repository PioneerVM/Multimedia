package com.xinxin.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xinxin.baselib.arouter.ARouterManager;

@Route(path = ARouterManager.LOGIN_INDEX_ACTIVITY)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_main);
    }
}
