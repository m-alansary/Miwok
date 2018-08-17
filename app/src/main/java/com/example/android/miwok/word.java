package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = -1;

    private int mAudioResourceID;



    /**
     * constructor for any new Word object
     * @param defaultTranslation the default trnslation (english as example)
     * @param miwokTranslation the miwok Translation
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * constructor for any new Word object
     * @param defaultTranslation the default trnslation (english as example)
     * @param miwokTranslation the miwok Translation
     * @param imageID the image resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageID, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageID;
        mAudioResourceID = audioResourceID;
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

    /**
     * @return the audio resource ID
     */
    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
