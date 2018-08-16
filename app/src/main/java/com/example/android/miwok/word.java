package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = -1;



    /**
     * constructor for any new Word object
     * @param defaultTranslation the default trnslation (english as example)
     * @param miwokTranslation the miwok Translation
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * constructor for any new Word object
     * @param defaultTranslation the default trnslation (english as example)
     * @param miwokTranslation the miwok Translation
     * @param imageID the image resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
    }

    /**
     * Get the default translation of a word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of a word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get image resource ID
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * @return weither or not word has an image
     */
    public boolean hasImage() {
        return mImageResourceID != -1;
    }
}
