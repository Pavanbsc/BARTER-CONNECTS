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
public class UserTab {

    @Id
    @GeneratedValue
    private Integer user_id;

    private String name;

    private String email;

    private Long phone_no;

    private String address;

    private String user_type;

    private String password;

    private Date created_at;

    private Date updated_at;

}
