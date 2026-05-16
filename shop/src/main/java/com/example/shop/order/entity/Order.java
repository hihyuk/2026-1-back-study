package com.example.shop.order.entity;

import com.example.shop.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @Column(name = "total_price")
    private int totalPrice;

    @Column(name = "point_used")
    private int pointUsed;

    @Column(name = "cash_amount")
    private int cashAmount;

    @Column(name = "status", length = 25)
    private String status;

    public Order(Member member) {
        this.member = member;
        this.orderDate = LocalDateTime.now();
        this.totalPrice = 0;
        this.pointUsed = 0;
        this.cashAmount = 0;
        this.status = "주문 대기중";
    }

    public void cancel() {
        this.status = "취소됨";
    }
}
