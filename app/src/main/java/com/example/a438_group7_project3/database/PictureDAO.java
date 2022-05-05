package com.example.a438_group7_project3.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PictureDAO {
    @Insert
    void insert(Picture... pictures);

    @Update
    void update(Picture... pictures);

    @Delete
    void delete(Picture picture);

    @Query("SELECT * FROM " + AppDataBase.PICTURE_TABLE + " ORDER BY pictureId ASC")
    List<Picture> getAllPictures();

    @Query("SELECT * FROM " + AppDataBase.PICTURE_TABLE + " WHERE pictureName = :pictureName")
    User getPicturebyPictureName(String pictureName);

    @Query("SELECT * FROM " + AppDataBase.PICTURE_TABLE + " WHERE pictureId = :pictureId")
    User getPicturebyPictureId(int pictureId);
}
