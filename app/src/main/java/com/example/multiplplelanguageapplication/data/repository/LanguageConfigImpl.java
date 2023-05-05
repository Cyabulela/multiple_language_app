package com.example.multiplplelanguageapplication.data.repository;

import com.example.multiplplelanguageapplication.data.Languages;
import com.example.multiplplelanguageapplication.data.preference.PreferenceManagement;
import com.example.multiplplelanguageapplication.domain.repository.LanguageConfig;
import com.example.multiplplelanguageapplication.util.Constant;

public class LanguageConfigImpl implements LanguageConfig {

    private PreferenceManagement preferenceManagement;

    public LanguageConfigImpl(PreferenceManagement preferenceManagement) {
        this.preferenceManagement = preferenceManagement;
    }

    @Override
    public Languages getSelectedLanguage() {
        String language = preferenceManagement.getString(Constant.KEY_COLLECTION_LANGUAGE);
        switch (language) {
            case "Zulu":
                return Languages.IsiZulu;
            case "Afrikaans":
                return Languages.Afrikaans;
            default:
                return Languages.English;
        }
    }

    @Override
    public void changeLanguage(Languages language) {
        preferenceManagement.putString(Constant.KEY_COLLECTION_LANGUAGE , language.getLanguage());
    }
}
