package com.ruri.mall.product.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author GokouRuri
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class CategoryDto {

    private Long id;

    private String name;

}
