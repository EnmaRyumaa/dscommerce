package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Category;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO() {}

    public CategoryDTO(Category entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
