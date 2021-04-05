package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.HotelRoom;
import com.vsu.hotel.data.models.TypeRoom;

import java.util.List;
import java.util.UUID;

public interface RoomRepository {
    HotelRoom findById(UUID uuid);
    List<HotelRoom> findByTypeRooms(TypeRoom typeRoom);

}
