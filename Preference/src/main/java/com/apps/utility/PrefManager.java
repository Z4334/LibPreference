package com.apps.utility;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {

    private static String PREFERENCE_NAME = "MyPreference";
    private static PrefManager sharedPreferenceUtils;
    private SharedPreferences sharedPreferences;

    private PrefManager(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    public static PrefManager getInstance(Context context) {
        if (sharedPreferenceUtils == null) {
            sharedPreferenceUtils = new PrefManager(context);
        }
        return sharedPreferenceUtils;
    }

    /**
     * Reset the singleton instance of {@link PrefManager}
     */
    public static void reset() {
        sharedPreferenceUtils = null;
    }

    public String getString(String key) {
        return sharedPreferences.getString(key, null);
    }

    public String getString(String key, String defVal) {
        return sharedPreferences.getString(key, defVal);
    }

    public void saveString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public int getInt(String key) {
        return sharedPreferences.getInt(key, 0);
    }

    public int getInt(String key, int defVal) {
        return sharedPreferences.getInt(key, defVal);
    }

    public void saveInt(String key, int value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public long getLong(String key) {
        return sharedPreferences.getLong(key, 0);
    }

    public long getLong(String key, long defVal) {
        return sharedPreferences.getLong(key, defVal);
    }

    public void saveLong(String key, long value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(key, value);
        editor.apply();
    }

    public boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defVal) {
        return sharedPreferences.getBoolean(key, defVal);
    }

    public void saveBoolean(String key, boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }

    public float getFloat(String key) {
        return sharedPreferences.getFloat(key, 0);
    }

    public float getFloat(String key, float defVal) {
        return sharedPreferences.getFloat(key, defVal);
    }

    public void saveFloat(String key, float value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(key, value);
        editor.apply();
    }

    /**
     * Clear all values from this preference
     */
    public void clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

    /**
     * Clear value of given key from preference
     *
     * @param mKey name of the key whose value to be removed
     */
    public void clear(String mKey) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(mKey);
        editor.apply();
    }
}
