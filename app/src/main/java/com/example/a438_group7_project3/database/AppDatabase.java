package com.example.a438_group7_project3.database;

import androidx.room.AutoMigration;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {User.class, Picture.class, Caption.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static final String USER_TABLE = "USER_TABLE";
    public static final String PICTURE_TABLE = "PICTURE_TABLE";
    public static final String CAPTION_TABLE = "CAPTION_TABLE";

    public abstract DAO getDao();
}
