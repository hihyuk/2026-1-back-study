package com.example.shop.member.dto;

import lombok.Getter;

// password, phoneNumber, address

@Getter
public class MemberUpdateRequest {

    private final String password;
    private final String phoneNumber;
    private final String address;

    public MemberUpdateRequest(String password, String phoneNumber, String address) {
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
