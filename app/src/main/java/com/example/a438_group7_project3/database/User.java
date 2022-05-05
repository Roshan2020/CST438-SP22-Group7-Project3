package com.example.a438_group7_project3.database;

import androidx.room.Entity;

import java.util.Objects;

@Entity(tableName = AppDataBase.USER_TABLE)
public class User {

    private Integer userId;
    private String username;
    private String firstname;
    private String lastname;
    private String password;
    private String profilePicture;

    public User(String username, String firstname, String lastname, String password, String profilePicture){
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.profilePicture = profilePicture;

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(username, user.username) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(password, user.password) && Objects.equals(profilePicture, user.profilePicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, firstname, lastname, password, profilePicture);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
