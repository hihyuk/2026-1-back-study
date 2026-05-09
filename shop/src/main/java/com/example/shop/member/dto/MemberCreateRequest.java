package com.example.shop.member.dto;

import lombok.Getter;

// loginId, password, phoneNumber, address

@Getter
public class MemberCreateRequest {

    private final String loginId;
    private final String password;
    private final String phoneNumber;
    private final String address;

    public MemberCreateRequest(String loginId, String password, String phoneNumber, String address) {
        this.loginId = loginId;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
