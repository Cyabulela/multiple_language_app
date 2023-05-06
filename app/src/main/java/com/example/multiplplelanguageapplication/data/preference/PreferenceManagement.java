package com.example.multiplplelanguageapplication.data.preference;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;

public class PreferenceManagement {

    private final SharedPreferences sharedPreferences;

    public PreferenceManagement(Context context) {
        sharedPreferences = context.getSharedPreferences("MyPreference" , Context.MODE_PRIVATE);
    }

    public void putString(@NonNull String key , String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key , value);
        editor.apply();
    }

    public String getString(@NonNull String key) {
        return sharedPreferences.getString(key , "English");
    }
}
