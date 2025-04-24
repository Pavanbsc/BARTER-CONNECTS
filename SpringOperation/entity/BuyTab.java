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
public class BuyTab {
    @Id
    @GeneratedValue
    private Integer buy_id;

    private Integer item_id;

    private Integer buyer_id;

    private Integer seller_id;

    private Double price;

    private String Status;

    private Date purchase_date;

    private String delivery_address;
}
