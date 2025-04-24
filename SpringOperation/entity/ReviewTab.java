package com.MainProject.SpringOperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReviewTab {

    @Id
    @GeneratedValue
    private Integer review_id;

    private Integer renter_id;

    private Integer item_id;

    private Integer ratings;

    private String review_text;

    private Date created_at;

    private Date updated_at;

}
