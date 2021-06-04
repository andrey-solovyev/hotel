package com.vsu.hotel.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRoom {
    private int id;
    private double cost;
    private int amountPeople;
    private TypeRoom typeRoom;

}
