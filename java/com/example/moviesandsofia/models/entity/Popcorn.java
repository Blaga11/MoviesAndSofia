package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
@Table(name = "popcorn")
public class Popcorn extends BaseEntity{
    private PopcornCategoryEnum popcornCategoryEnum;
    private BigDecimal price;
    private boolean availability;

    public Popcorn() {
    }

    @Enumerated(value = EnumType.STRING)
    @Column(name = "popcorn_category_enum")
    public PopcornCategoryEnum getFoodCategoryEnum() {
        return popcornCategoryEnum;
    }

    public void setFoodCategoryEnum(PopcornCategoryEnum popcornCategoryEnum) {
        this.popcornCategoryEnum = popcornCategoryEnum;
    }

    @Positive
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "availability")
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
