package com.example.moviesandsofia.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    private String fullName;
    private String username;
    private String email;
    private String password;
    private Integer age;
    private Role role;
    private Set<Movie> upcomingMovies;
    private Set<Movie> pastMovies;
    private Set<Accessory> boughtAccessories;
    private Set<CinemaLocation> cinemaLocations;


    public User() {
    }

    @Column(unique = true,  nullable = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(unique = true,  nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Min(12)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @ManyToOne
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @OneToMany
    public Set<Movie> getUpcomingMovies() {
        return upcomingMovies;
    }

    public void setUpcomingMovies(Set<Movie> upcomingMovies) {
        this.upcomingMovies = upcomingMovies;
    }

    @OneToMany
    public Set<Movie> getPastMovies() {
        return pastMovies;
    }

    public void setPastMovies(Set<Movie> pastMovies) {
        this.pastMovies = pastMovies;
    }

    @OneToMany
    public Set<Accessory> getBoughtAccessories() {
        return boughtAccessories;
    }

    public void setBoughtAccessories(Set<Accessory> boughtAccessories) {
        this.boughtAccessories = boughtAccessories;
    }

    @OneToMany
    public Set<CinemaLocation> getCinemaLocations() {
        return cinemaLocations;
    }

    public void setCinemaLocations(Set<CinemaLocation> cinemaLocations) {
        this.cinemaLocations = cinemaLocations;
    }
}
