package com.example.a438_group7_project3.database;

public interface PictureRepo extends CrudRepository<Picture, Integer> {
    Picture findPictureByPictureId(Integer pictureId);
    Picture findPictureByPictureName(String name);
}
