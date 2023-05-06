package com.example.multiplplelanguageapplication.data;

public enum Language {
    English("English"),
    IsiZulu("Zulu"),
    Afrikaans("Afrikaans");

    private String language;
    Language(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
