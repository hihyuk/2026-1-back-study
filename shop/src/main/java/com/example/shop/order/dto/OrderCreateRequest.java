package com.example.shop.order.dto;

import com.example.shop.member.Member;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderCreateRequest {
    public final Long member;
    private final LocalDateTime orderDate;
    private final int totalPrice;
    private final int pointUsed;
    private final int cashAmount;
    private final String status;

    public OrderCreateRequest(Member member, LocalDate orderDate, int totalPrice, int pointUsed, int cashAmount, String status) {
        this.member = member.getId();
        this.orderDate = LocalDateTime.now();
        this.totalPrice = 0;
        this.pointUsed = 0;
        this.cashAmount = 0;
        this.status = "주문 대기중";
    }
}
