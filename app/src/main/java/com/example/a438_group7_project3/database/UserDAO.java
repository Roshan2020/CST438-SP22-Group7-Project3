package com.example.a438_group7_project3.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDAO {
    @Insert
    void insert(User... users);

    @Update
    void update(User... users);

    @Delete
    void delete(User user);

    @Query("SELECT * FROM " + AppDataBase.USER_TABLE + " ORDER BY username ASC")
    List<User> getAllUsers();

    @Query("SELECT * FROM " + AppDataBase.USER_TABLE + " WHERE username = :username")
    User getUserbyUsername(String username);

    @Query("SELECT * FROM " + AppDataBase.USER_TABLE + " WHERE userId = :userid")
    User getUserbyUserId(int userid);
}
