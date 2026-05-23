package com.example.shop.order.dto;

import com.example.shop.common.message.ErrorMessage;
import com.example.shop.member.entity.Member;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderCreateRequest {
    public final Long member;
    private final LocalDateTime orderDate;
    private final int totalPrice;
    private final int pointUsed;
    private final int cashAmount;

    @NotNull(message = "주문 상태는 필수입니다.")
    @Size(min = 1, max = 20, message = "상태는 1자 이상 20자 이하여야 합니다.")
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
