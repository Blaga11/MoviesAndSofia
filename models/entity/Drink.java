package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
@Table(name = "drinks")
public class Drink extends BaseEntity{
    private DrinkCategoryEnum drinkCategoryEnum;
    private BigDecimal price;
    private boolean availability;

    public Drink() {
    }

    @Enumerated(value = EnumType.ORDINAL)
    public DrinkCategoryEnum getDrinkCategoryEnum() {
        return drinkCategoryEnum;
    }

    public void setDrinkCategoryEnum(DrinkCategoryEnum drinkCategoryEnum) {
        this.drinkCategoryEnum = drinkCategoryEnum;
    }

    @Positive
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
