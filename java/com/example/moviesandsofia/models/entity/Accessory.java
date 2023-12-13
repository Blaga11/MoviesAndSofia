package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

@Entity
@Table(name = "accessories")
public class Accessory extends BaseEntity{
    private String name;
    private String description;
    private AccessoryCategoryEnum accessoryCategoryEnum;
    private BigDecimal price;
    private String imageUrl;
    private String color;
    private String size;
    private boolean availability;
    private Movie movie;

    public Accessory() {
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Min(3)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Enumerated(value = EnumType.STRING)
    @Column
    public AccessoryCategoryEnum getAccessoryCategoryEnum() {
        return accessoryCategoryEnum;
    }

    public void setAccessoryCategoryEnum(AccessoryCategoryEnum accessoryCategoryEnum) {
        this.accessoryCategoryEnum = accessoryCategoryEnum;
    }

    @Positive
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Column
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Column
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @ManyToOne
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
