package com.example.multiplplelanguageapplication.domain.repository;

import com.example.multiplplelanguageapplication.data.Languages;

public interface LanguageConfig {

    public Languages getSelectedLanguage();
    public void changeLanguage(Languages language);
}
