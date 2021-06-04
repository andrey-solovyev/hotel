package com.vsu.hotel.data.repository.impl;

import com.vsu.hotel.data.models.HotelRoom;
import com.vsu.hotel.data.models.TypeRoom;
import com.vsu.hotel.data.repository.RoomRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class RoomRepositoryImp implements RoomRepository {
    @Override
    public HotelRoom findById(int id) {
        return null;
    }

    @Override
    public List<HotelRoom> findByTypeRooms(TypeRoom typeRoom) {
        return null;
    }
}
