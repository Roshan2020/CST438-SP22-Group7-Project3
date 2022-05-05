package com.example.a438_group7_project3.database;

import androidx.room.Entity;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity(tableName = AppDataBase.CAPTION_TABLE)
public class Caption {

    private Integer captionId;
    private Integer userId;   // = (who) author of the caption
    private String content;   // = wht the caption says
    private Date captionDate; // = when caption was created
    private Time captionTime;
    private Integer captionLikes;

    public Caption(Integer userId, String content, Date captionDate, Time captionTime) {
        this.userId = userId;
        this.content = content;
        this.captionDate = captionDate;
        this.captionTime = captionTime;
    }

    public Integer getCaptionId() {
        return captionId;
    }

    public void setCaptionId(Integer captionId) {
        this.captionId = captionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCaptionDate() {
        return captionDate;
    }

    public void setCaptionDate(Date captionDate) {
        this.captionDate = captionDate;
    }

    public Time getCaptionTime() {
        return captionTime;
    }

    public void setCaptionTime(Time captionTime) {
        this.captionTime = captionTime;
    }

    public Integer getCaptionLikes() {
        return captionLikes;
    }

    public void setCaptionLikes(Integer captionLikes) {
        this.captionLikes = captionLikes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caption caption = (Caption) o;
        return Objects.equals(captionId, caption.captionId) && Objects.equals(userId, caption.userId) && Objects.equals(content, caption.content) && Objects.equals(captionDate, caption.captionDate) && Objects.equals(captionTime, caption.captionTime) && Objects.equals(captionLikes, caption.captionLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(captionId, userId, content, captionDate, captionTime, captionLikes);
    }

    @Override
    public String toString() {
        return "Caption{" +
                "captionId=" + captionId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", captionDate=" + captionDate +
                ", captionTime=" + captionTime +
                ", captionLikes=" + captionLikes +
                '}';
    }
}
