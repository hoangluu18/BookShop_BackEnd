package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "payment_method")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_method_id")
    private int paymentMethodId;
    @Column(name = "payment_method_name")
    private String paymentMethodName;
    @Column(name = "payment_method_description")
    private String paymentMethodDescription;
    @Column(name = "payment_method_cost")
    private double paymentMethodCost;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentMethod", cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    private List<Order> orderList;
}
