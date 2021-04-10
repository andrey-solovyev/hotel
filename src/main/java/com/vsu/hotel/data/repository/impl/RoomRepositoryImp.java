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
    private List<HotelRoom> hotelRooms;

    public RoomRepositoryImp() {
        this.hotelRooms = new ArrayList<>();
        initializeRooms();
    }
    private void initializeRooms(){
        this.hotelRooms.add(new HotelRoom(25,1, TypeRoom.Single));
        this.hotelRooms.add(new HotelRoom(25,1, TypeRoom.Single));
        this.hotelRooms.add(new HotelRoom(30,2, TypeRoom.SimpleDouble));
        this.hotelRooms.add(new HotelRoom(30,2, TypeRoom.SimpleDouble));
        this.hotelRooms.add(new HotelRoom(40,2, TypeRoom.SofaDouble));
        this.hotelRooms.add(new HotelRoom(110,4, TypeRoom.Luxury));
        this.hotelRooms.add(new HotelRoom(80,3, TypeRoom.JuniorSuite));
        this.hotelRooms.add(new HotelRoom(80,3, TypeRoom.JuniorSuite));
    }

    @Override
    public HotelRoom findById(UUID uuid) {
        for (HotelRoom h:getHotelRooms()){
            if (h.getUuid().equals(uuid)){
                return h;
            }
        }
        return null;
    }

    @Override
    public List<HotelRoom> findByTypeRooms(TypeRoom typeRoom) {
        List<HotelRoom> typesRoom = getHotelRooms().stream().filter(h -> h.getTypeRoom()==typeRoom).collect(Collectors.toList());
        return typesRoom;
    }

    public List<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(List<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }
}
