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
@NoArgsConstructor
@AllArgsConstructor
public class ItemTab {

    @Id
    @GeneratedValue
    private Integer item_id;

    private Integer user_id;

    private String title;

    private String category;

    private String description;

    private Integer price;

    private String status;

    private Boolean exchange_allowed;

    private Date created_at=new Date();

    private Date updated_at=new Date();

    private String imageUrl;
}
