package com.project.BookStore_Backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_code")
    private Date dateCreated;
    @Column(name = "purchase_address", length = 512)
    private String purchaseAddress;
    @Column(name = "delivery_address", length = 512)
    private String deliveryAddress;
    @Column(name = "product_total")
    private double productTotal;//tong tien san pham
    @Column(name = "shipping_cost")
    private double shippingCost; //phi van chuyen
    @Column(name = "payment_cost")
    private double paymentCost; //chi phi thanh toan
    @Column(name = "total")
    private double total; //tong tien

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetailList; //danh sach chi tiet gio hang

    @ManyToOne(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod; //hinh thuc thanh toan


    @ManyToOne(fetch = FetchType.LAZY, cascade = {
            CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name = "shipping_method_id")
    private ShippingMethod shippingMethod; //hinh thuc van chuyen
}
