package com.example.gmd507;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefHelper {
    private static PrefHelper instance;
    private static SharedPreferences pref;

    private PrefHelper() {
        // private constructor for singleton impl
    }

    public static PrefHelper getInstance(Context context) {
        if (instance == null) {
            instance = new PrefHelper();
            pref = context.getSharedPreferences("gmd_507", Context.MODE_PRIVATE);
        }
        return instance;
    }

    public void putString(String key, String val) {
        pref.edit().putString(key, val).apply();
    }

    public void setUserId(String userId) {
        pref.edit().putString("user_id", userId).apply();
    }

    public String getUserId() {
        return pref.getString("user_id", null);
    }
}
