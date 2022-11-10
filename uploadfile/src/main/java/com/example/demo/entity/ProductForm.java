package com.example.demo.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductForm {
    private Long id;
    private String name;
    private String description;
    private MultipartFile image;

    public ProductForm() {
    }

    public ProductForm(ProductFormBuilder productFormBuilder) {
        this.name = productFormBuilder.name;
        this.description = productFormBuilder.description;
        this.image = productFormBuilder.image;
    }

    public static class ProductFormBuilder {
        private final String name;
        private String description;
        private MultipartFile image;

        public ProductFormBuilder(String name) {
            this.name = name;
        }

        public ProductFormBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductFormBuilder image(MultipartFile image) {
            this.image = image;
            return this;
        }

        public ProductForm build() {
            return new ProductForm(this);
        }
    }
}
