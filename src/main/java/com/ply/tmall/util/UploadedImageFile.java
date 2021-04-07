package com.ply.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author ply
 * @date 2021/3/3 - 11:43
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}
