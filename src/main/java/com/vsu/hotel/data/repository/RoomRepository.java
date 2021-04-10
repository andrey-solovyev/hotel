package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.HotelRoom;
import com.vsu.hotel.data.models.TypeRoom;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
@Component
public interface RoomRepository {
    HotelRoom findById(UUID uuid);
    List<HotelRoom> findByTypeRooms(TypeRoom typeRoom);

}
