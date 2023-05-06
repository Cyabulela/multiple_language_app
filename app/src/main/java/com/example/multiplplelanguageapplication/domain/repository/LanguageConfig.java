package com.example.multiplplelanguageapplication.domain.repository;

import com.example.multiplplelanguageapplication.data.Language;

public interface LanguageConfig {

    Language getSelectedLanguage();
    void changeLanguage(Language language);
}
