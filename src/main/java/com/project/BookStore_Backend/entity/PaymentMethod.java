package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;

@Data
public class PaymentMethod {
    private int paymentMethodId;
    private String paymentMethodName;
    private String paymentMethodDescription;
    private  double paymentMethodCost;
    private List<Order> orderList;
}
