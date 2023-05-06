package com.example.multiplplelanguageapplication.data.repository;

import com.example.multiplplelanguageapplication.data.Language;
import com.example.multiplplelanguageapplication.data.preference.PreferenceManagement;
import com.example.multiplplelanguageapplication.domain.repository.LanguageConfig;
import com.example.multiplplelanguageapplication.util.Constant;

public class LanguageConfigImpl implements LanguageConfig {

    private final PreferenceManagement preferenceManagement;

    public LanguageConfigImpl(PreferenceManagement preferenceManagement) {
        this.preferenceManagement = preferenceManagement;
    }

    @Override
    public Language getSelectedLanguage() {
        String language = preferenceManagement.getString(Constant.KEY_COLLECTION_LANGUAGE);
        language = (language != null)? language : "English";
        switch (language) {
            case "Zulu":
                return Language.IsiZulu;
            case "Afrikaans":
                return Language.Afrikaans;
            default:
                return Language.English;
        }
    }

    @Override
    public void changeLanguage(Language language) {
        preferenceManagement.putString(Constant.KEY_COLLECTION_LANGUAGE , language.getLanguage());
    }
}
