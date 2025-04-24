package com.MainProject.SpringOperation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @Column(unique = true, nullable = false)  // Email is unique identifier
    private String email;  // Use email as the unique identifier instead of ID

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String address;
    private String streetName;
    private String city;
    private String state;
    private String pincode;
    private String mobileNo;

    private String password;
    private String confirmPassword;
}
