package com.anton.dev.mywork_onactivityresult_and_requestcode.Utils;

public enum Language {
    ENGLISH("Английский"),
    RUSSIAN("Русский"),
    UKRAINE("Украинский");
    private String language;
    Language(String language){
        this.language = language;
    }
    public String getLanguage(){
        return language;
    }
}
