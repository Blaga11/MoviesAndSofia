package com.example.moviesandsofia.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "cinema_locations")
public class CinemaLocation extends BaseEntity{
    private String address;
    private Integer seatsPerHall;
    private Integer numberOfHalls;
    private Boolean availableParking;

    public CinemaLocation() {
    }

    @NotNull
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Min(30)
    public Integer getSeatsPerHall() {
        return seatsPerHall;
    }

    public void setSeatsPerHall(Integer seatsPerHall) {
        this.seatsPerHall = seatsPerHall;
    }

    @Min(10)
    public Integer getNumberOfHalls() {
        return numberOfHalls;
    }

    public void setNumberOfHalls(Integer numberOfHalls) {
        this.numberOfHalls = numberOfHalls;
    }

    @Column
    public Boolean getAvailableParking() {
        return availableParking;
    }

    public void setAvailableParking(Boolean availableParking) {
        this.availableParking = availableParking;
    }
}
