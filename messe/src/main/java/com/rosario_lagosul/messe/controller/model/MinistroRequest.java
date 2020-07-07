package com.rosario_lagosul.messe.controller.model;

import java.time.LocalDateTime;

public class MinistroRequest {

    private String name;
    private String phone;
    private String email;
    private String address;
    private boolean availability;
    private LocalDateTime createdAT;
    private LocalDateTime updatedAT;

    public MinistroRequest() {}

    public MinistroRequest(String name, String phone, String email, String address, boolean availability, LocalDateTime createdAT, LocalDateTime updatedAT) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.availability = availability;
        this.createdAT = createdAT;
        this.updatedAT = updatedAT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public LocalDateTime getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(LocalDateTime createdAT) {
        this.createdAT = createdAT;
    }

    public LocalDateTime getUpdatedAT() {
        return updatedAT;
    }

    public void setUpdatedAT(LocalDateTime updatedAT) {
        this.updatedAT = updatedAT;
    }
}
