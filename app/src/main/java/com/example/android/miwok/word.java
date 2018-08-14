package com.example.android.miwok;

public class Word {

    private String mDefauktTranslation;

    private String mMiwokTranslation;

    public Word(String defaoutTranslation, String miwokTranslation) {
        mDefauktTranslation = defaoutTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of a word
     */
    public String getDefaultTranslation() {
        return mDefauktTranslation;
    }

    /**
     * Get the miwok translation of a word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
