package com.example.a438_group7_project3.database;

import android.graphics.Paint;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CaptionDAO {
    @Insert
    void insert(Caption... captions);

    @Update
    void update(Caption... captions);

    @Delete
    void delete(Caption caption);

    @Query("SELECT * FROM " + AppDataBase.CAPTION_TABLE + " ORDER BY captionId ASC")
    List<Picture> getAllCaptions();

    @Query("SELECT * FROM " + AppDataBase.CAPTION_TABLE + " WHERE captionId = :captionId")
    User getCaptionbyCaptionId(String captionId);

    @Query("SELECT * FROM " + AppDataBase.CAPTION_TABLE + " WHERE userId = :userId")
    User getCaptionbyUserId(int userId);
}
