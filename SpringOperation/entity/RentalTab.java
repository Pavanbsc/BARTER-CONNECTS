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
public class RentalTab {

    @Id
    @GeneratedValue
    private Integer rental_id;

    private Integer item_id;

    private Integer renter_id;

    private Date rental_start_date;

    private Date rental_end_date;

    private Double total_price;

    private String status;

    private Date created_at;

    private Date updated_at;

}
