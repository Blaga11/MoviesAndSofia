package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity{
    private RoleEnum roleEnum;

    public Role() {
    }

    @Enumerated(value = EnumType.STRING)
    public RoleEnum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }
}
