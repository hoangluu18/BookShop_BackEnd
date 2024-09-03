package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "shipping_method")
public class ShippingMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_method_id")
    private int shippingMethodId;
    @Column(name = "shipping_method_name")
    private String shippingMethodName;
    @Column(name = "shipping_description")
    private String shippingDescription;
    @Column(name = "shipping_cost")
    private  double shippingCost;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shippingMethod", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
