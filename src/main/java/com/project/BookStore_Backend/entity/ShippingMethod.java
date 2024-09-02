package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.util.List;
@Data
public class ShippingMethod {
    private int shippingMethodId;
    private String shippingMethodName;
    private String shippingDescription;
    private  double shippingCost;
    private List<Order> orderList;
}
