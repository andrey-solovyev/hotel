package com.vsu.hotel.data.models;

import java.util.Date;
import java.util.UUID;

public class Guest {
    private UUID uuid;
    private String name;
    private String surname;
    private Date birthdate;
    private String passport;

    public Guest(String name, String surname, Date birthdate, String passport) {
        this.uuid=UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.passport = passport;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
