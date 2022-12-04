package com.ruri.mall.product.mapper;

import com.ruri.mall.product.dto.CategoryDto;
import com.ruri.mall.product.entity.CategoryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author GokouRuri
 */
@Mapper
public interface CategoryEntityMapper {

    /**
     * mapper实例
     */
    CategoryEntityMapper INTSANCE= Mappers.getMapper(CategoryEntityMapper.class);

    /**
     * entity -> dto
     * @param entity entity
     * @return dto
     */
    @Mapping(target = "id", source = "catId")
    CategoryDto toDto(CategoryEntity entity);

    /**
     * entity -> dto
     * @param entities entities
     * @return dto
     */
    List<CategoryDto> toDto(List<CategoryEntity> entities);
}
