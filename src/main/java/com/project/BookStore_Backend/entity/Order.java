package com.project.BookStore_Backend.entity;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class Order {

    private int orderId;
    private Date dateCreated;
    private String purchaseAddress;
    private String deliveryAddress;
    private double productTotal;//tong tien san pham
    private double shippingCost; //phi van chuyen
    private double paymentCost; //chi phi thanh toan
    private double total; //tong tien
    private List<OrderDetail> orderDetailList; //danh sach chi tiet gio hang

    private User user;
    private PaymentMethod paymentMethod; //hinh thuc thanh toan

    private ShippingMethod shippingMethod; //hinh thuc van chuyen
}
