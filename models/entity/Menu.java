package com.example.moviesandsofia.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "menus")
public class Menu extends BaseEntity{
    private String name;
    private String description;
    private BigDecimal price;
    private Set<Popcorn> popcorn;
    private Set<Drink> drinks;
    private boolean availability;

    public Menu() {
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Positive
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @OneToMany
    public Set<Popcorn> getPopcorn() {
        return popcorn;
    }

    public void setPopcorn(Set<Popcorn> popcorn) {
        this.popcorn = popcorn;
    }

    @OneToMany
    public Set<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(Set<Drink> drinks) {
        this.drinks = drinks;
    }

    @Column
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
