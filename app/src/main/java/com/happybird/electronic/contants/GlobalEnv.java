package com.happybird.electronic.contants;

import com.git.easylib.util.StoreUtil;
import com.google.gson.Gson;
import com.happybird.electronic.http.model.UserInfo;
import com.happybird.electronic.util.ConstCode;

import java.util.Map;


/**
 * 全局变量
 * @author dyf
 */
public class GlobalEnv {
    private static final String TAG = GlobalEnv.class.getSimpleName();

    private static Map<String, Integer> drawbleMap;

    public static UserInfo userInfo;

    public static UserInfo getUserInfo() {
        if (userInfo == null) {
            String userstring = StoreUtil.getString(ConstCode.STORAGE_USERINFO_KEY);
            if (userstring == null) {
                return null;
            }
            userInfo = new Gson().fromJson(userstring, UserInfo.class);
        }
        return userInfo;
    }

}
