package com.vsu.hotel.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    public int id;
    /**Дата заявки**/
    private Date dateCreateOrder;
    /**Отель**/
    private HotelRoom hotelRoom;
    /**Забронирована ли заявка через интернет**/
    private boolean isBooking;
    /**Имя гостя на которого оформлен номер**/
    private Guest guest;
    /**Дата заезда**/
    private Date arrivalDate;
    /**Дата выезда**/
    private Date endDate;

}
