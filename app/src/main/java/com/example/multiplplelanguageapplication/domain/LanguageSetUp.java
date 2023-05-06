package com.example.multiplplelanguageapplication.domain;

import static com.example.multiplplelanguageapplication.data.Language.Afrikaans;
import static com.example.multiplplelanguageapplication.data.Language.English;
import static com.example.multiplplelanguageapplication.data.Language.IsiZulu;
import android.content.Context;
import com.example.multiplplelanguageapplication.R;
import com.example.multiplplelanguageapplication.data.Language;
import com.example.multiplplelanguageapplication.data.preference.PreferenceManagement;
import com.example.multiplplelanguageapplication.data.repository.LanguageConfigImpl;
import com.example.multiplplelanguageapplication.domain.repository.LanguageConfig;

public class LanguageSetUp {
    private static LanguageConfig languageConfig;

    public LanguageSetUp(Context context) {
        languageConfig = new LanguageConfigImpl(new PreferenceManagement(context));
    }

    public static void setLanguage(int itemId) {
        if (itemId == R.id.language_english) {
            languageConfig.changeLanguage(English);
        } else if (itemId == R.id.language_zulu) {
            languageConfig.changeLanguage(IsiZulu);
        } else if(itemId == R.id.language_afrikaans) {
            languageConfig.changeLanguage(Afrikaans);
        }
    }

    public Language getLanguage() {
        return languageConfig.getSelectedLanguage();
    }
}
