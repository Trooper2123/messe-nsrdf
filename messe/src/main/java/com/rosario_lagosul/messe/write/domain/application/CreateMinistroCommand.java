package com.rosario_lagosul.messe.write.domain.application;

public class CreateMinistroCommand {

    private final int id;
    private final String name;
    private final String phone;
    private final String address;
    private final String email;
    private final boolean availability;

    public CreateMinistroCommand(int id, String name, String phone, String address, String email, boolean availability) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAvailability() {
        return availability;
    }
}
