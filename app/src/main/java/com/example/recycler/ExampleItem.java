package com.example.recycler;

public class ExampleItem {

    private int mImageRessource;
    private String mText;

    public ExampleItem(int imageRessource, String text){

        mImageRessource =imageRessource;
        mText = text;
    }

    public int getmImageRessource() {
        return mImageRessource;
    }

    public String getmText() {
        return mText;
    }
}
