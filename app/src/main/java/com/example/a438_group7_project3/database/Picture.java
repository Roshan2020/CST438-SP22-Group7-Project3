package com.example.a438_group7_project3.database;

import androidx.annotation.IdRes;
import androidx.room.Entity;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = AppDatabase.PICTURE_TABLE)
public class Picture {

    private Integer pictureId;
    private String pictureName;
    private String pictureUrl;
    private List<Caption> captionList;

    public Picture(String pictureName, String pictureUrl) {
        this.pictureName = pictureName;
        this.pictureUrl = pictureUrl;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public List<Caption> getCaptionList() {
        return captionList;
    }

    public void setCaptionList(List<Caption> captionList) {
        this.captionList = captionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return Objects.equals(pictureId, picture.pictureId) && Objects.equals(pictureName, picture.pictureName) && Objects.equals(pictureUrl, picture.pictureUrl) && Objects.equals(captionList, picture.captionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pictureId, pictureName, pictureUrl, captionList);
    }

    @Override
    public String toString() {
        return "Picture{" +
                "pictureId=" + pictureId +
                ", pictureName='" + pictureName + '\'' +
                ", pictureUrl='" + pictureUrl + '\'' +
                ", captionList=" + captionList +
                '}';
    }
}
