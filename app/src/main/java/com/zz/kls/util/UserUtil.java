package com.zz.kls.util;

import com.zz.kls.base.BaseApplication;

import static android.content.Context.MODE_PRIVATE;
import static com.zz.kls.model.PublicParamsModel.MSORGANIZEID;
import static com.zz.kls.model.PublicParamsModel.MSTOKEN;
import static com.zz.kls.model.PublicParamsModel.MSUSERID;
import static com.zz.kls.model.PublicParamsModel.MSUSERTYPE;

/**
 * Created by Hoyn on 17/4/5.
 */

public class UserUtil {

    private static final String PUBLICPARAMS = "publicParams";

    public static String getUserId() {
        return BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).getString(MSUSERID, "");
    }

    public static int getUserType() {
        return BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).getInt(MSUSERTYPE, 0);
    }

    public static String getOrganizeId() {
        return BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).getString(MSORGANIZEID, "");
    }

    public static String getToken() {
        return BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).getString(MSTOKEN, "");
    }

    public static void setUserId(String userId) {
        BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).edit().putString(MSUSERID, userId).commit();
    }

    public static void setUserType(int userType) {
        BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).edit().putInt(MSUSERTYPE, userType).commit();
    }

    public static void setOrganizeId(String organizeId) {
        BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).edit().putString(MSORGANIZEID, organizeId).commit();
    }

    public static void setToken(String token) {
        BaseApplication.getContextObject().getSharedPreferences(PUBLICPARAMS, MODE_PRIVATE).edit().putString(MSTOKEN, token).commit();
    }
}
