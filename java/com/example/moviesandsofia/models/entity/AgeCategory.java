package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ageCategories")
public class AgeCategory extends BaseEntity{
    private AgeCategoryEnum ageCategoryEnum;

    public AgeCategory() {
    }

    @Enumerated(EnumType.STRING)
    @Column
    public AgeCategoryEnum getAgeCategoryEnum() {
        return ageCategoryEnum;
    }

    public void setAgeCategoryEnum(AgeCategoryEnum ageCategoryEnum) {
        this.ageCategoryEnum = ageCategoryEnum;
    }
}
