package com.xinxin.baselib.arouter;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author ydm
 * @date 2019-06-13
 * @desc
 */
public class ARouterUtils {

    public static void navigationWithNoParams(String address) {
        ARouter.getInstance().build(address).navigation();
    }
}
