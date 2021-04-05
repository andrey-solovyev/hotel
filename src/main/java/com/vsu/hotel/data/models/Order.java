package com.vsu.hotel.data.models;

import java.util.Calendar;
import java.util.UUID;

public class Order {
    public UUID uuid;
    private Calendar dateCreateOrder;
    private HotelRoom hotelRoom;
    private Guest guest;
    private Calendar arrivalDate;
    private Calendar endDate;

    public Order(Calendar dateCreateOrder, HotelRoom hotelRoom, Guest guest, Calendar arrivalDate, Calendar endDate) {
        this.uuid=UUID.randomUUID();
        this.dateCreateOrder = dateCreateOrder;
        this.hotelRoom = hotelRoom;
        this.guest = guest;
        this.arrivalDate = arrivalDate;
        this.endDate = endDate;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Calendar getDateCreateOrder() {
        return dateCreateOrder;
    }

    public void setDateCreateOrder(Calendar dateCreateOrder) {
        this.dateCreateOrder = dateCreateOrder;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
}
