package com.example.a438_group7_project3.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {
    // User DAO Operations
    @Insert
    void insert(User... users);

    @Update
    void update(User... users);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " ORDER BY username ASC")
    List<User> getAllUsers();

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " WHERE username = :username")
    User getUserbyUsername(String username);

    @Query("SELECT * FROM " + AppDatabase.USER_TABLE + " WHERE userId = :userid")
    User getUserbyUserId(int userid);

    // Picture DAO Operations
    @Insert
    void insert(Picture... pictures);

    @Update
    void update(Picture... pictures);

    @Delete
    void delete(Picture picture);

    @Query("SELECT * FROM " + AppDatabase.PICTURE_TABLE + " ORDER BY pictureId ASC")
    List<Picture> getAllPictures();

    @Query("SELECT * FROM " + AppDatabase.PICTURE_TABLE + " WHERE pictureName = :pictureName")
    User getPicturebyPictureName(String pictureName);

    @Query("SELECT * FROM " + AppDatabase.PICTURE_TABLE + " WHERE pictureId = :pictureId")
    User getPicturebyPictureId(int pictureId);

    @Insert
    void insert(Caption... captions);

    @Update
    void update(Caption... captions);

    @Delete
    void delete(Caption caption);

    @Query("SELECT * FROM " + AppDatabase.CAPTION_TABLE + " ORDER BY captionId ASC")
    List<Picture> getAllCaptions();

    @Query("SELECT * FROM " + AppDatabase.CAPTION_TABLE + " WHERE captionId = :captionId")
    User getCaptionbyCaptionId(String captionId);

    @Query("SELECT * FROM " + AppDatabase.CAPTION_TABLE + " WHERE userId = :userId")
    User getCaptionbyUserId(int userId);
}
