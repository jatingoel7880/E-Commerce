package com.jatin.spring.ecommerce.dto;

import com.jatin.spring.ecommerce.model.Category;
import lombok.Data;

//Data Transfer Object(DTO)
//cant handle the category object directly on a view so that's why dto is created
@Data   //This class is just act as a holder to hold object and contain all the properties of the product class
public class ProductDTO {
        private Long id;
        private String name;
        private int categoryId;
        private double price;
        private double weight;
        private String description;
        private String imageName;
}
