package com.example.shop.product.dto;

import com.example.shop.common.message.ErrorMessage;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProductCreateRequest {

    @NotNull(message = "상품명은 필수입니다.")
    @Size(min = 1, max = 50, message = "상품명은 1자 이상 50자 이하여야 합니다.")
    private String name;

    private int price;
    private int stock;
}
