package com.example.app3;

import android.net.Uri;

public interface iModel {
    public void loadImage(Uri imageUri);
    public void convertImage();
    public void saveImage(String fileName);
}
