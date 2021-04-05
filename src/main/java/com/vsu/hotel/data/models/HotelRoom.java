package com.vsu.hotel.data.models;

import lombok.Data;

import java.util.UUID;
public class HotelRoom {
    private UUID uuid;
    private double cost;
    private int amountPeople;
    private TypeRoom typeRoom;

    public HotelRoom(double cost, int amountPeople, TypeRoom typeRoom) {
        this.uuid=UUID.randomUUID();
        this.cost = cost;
        this.amountPeople = amountPeople;
        this.typeRoom = typeRoom;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

}
