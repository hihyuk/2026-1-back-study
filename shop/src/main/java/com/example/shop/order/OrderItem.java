package com.example.shop.order;

import com.example.shop.order.entity.Order;
import com.example.shop.product.entity.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "items")
@Getter
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "order_price")
    private int orderPrice;

    @Column(name = "count")
    private int count;

    public OrderItem(Order order, Product product, int orderPrice, int count) {
        this.order = order;
        this.product = product;
        this.orderPrice = orderPrice;
        this.count = count;
    }
}
