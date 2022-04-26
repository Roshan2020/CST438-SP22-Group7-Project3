package com.example.a438_group7_project3.database;

public interface CaptionRepo  extends CrudRepository<Caption, Integer> {
    Caption findCaptionByCaptionId(Integer captionId);
}
