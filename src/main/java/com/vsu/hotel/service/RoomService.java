package com.vsu.hotel.service;

import com.vsu.hotel.data.models.HotelRoom;
import com.vsu.hotel.data.models.TypeRoom;
import com.vsu.hotel.data.repository.RoomRepository;
import net.bytebuddy.utility.JavaConstant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    private HotelRoom findById(int id){
        return roomRepository.findById(id);
    }
    private List<HotelRoom> findAll(TypeRoom typeRoom){
        return roomRepository.findByTypeRooms(typeRoom);
    }
}
