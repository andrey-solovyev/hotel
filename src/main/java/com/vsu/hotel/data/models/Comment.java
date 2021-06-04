package com.vsu.hotel.data.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private int id;

    private Date dateComment;

    private String textComment;

    private int rating;
}
