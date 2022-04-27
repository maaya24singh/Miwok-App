package com.example.android.miwok;

public class Word {
    private String MiwokTranslate;
    private String DefaultTranslate;
    private int mAudioresourceId;
    private int getimage = hasimage;
    private static final int hasimage = -1;

    public Word( String DefaultTranslate, String MiwokTranslate, int AudioresourceId){
        this.DefaultTranslate = DefaultTranslate;
        this.MiwokTranslate = MiwokTranslate;
        this.mAudioresourceId = AudioresourceId;
    }
    public Word(String DefaultTranslate, String MiwokTranslate, int getimage, int AudioresourceId){
        this.DefaultTranslate = DefaultTranslate;
        this.MiwokTranslate = MiwokTranslate;
        this.getimage = getimage;
        this.mAudioresourceId = AudioresourceId;
    }

    public String getMiwokTranslate(){
        return MiwokTranslate;
    }

    public String getDefaultTranslate() {
        return DefaultTranslate;
    }

    public int getImage(){return getimage; }

    public boolean has_image(){ return hasimage != getimage; }

    public int getmAudioresourceId(){ return mAudioresourceId; }
}
