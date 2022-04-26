package com.example.a438_group7_project3.database;

public interface UserRepo extends CrudRepository<User, Integer>{
    User findUserByUsername(String username);
    User findUserByUserId(Integer userId);
    Boolean existUserByUsername(String username);
}
