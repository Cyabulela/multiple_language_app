package com.example.multiplplelanguageapplication.data;

public enum Languages {
    English("English"),
    IsiZulu("Zulu"),
    Afrikaans("Afrikaans");

    private String language;
    Languages(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
