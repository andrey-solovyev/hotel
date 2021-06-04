package com.vsu.hotel.service;

import com.vsu.hotel.data.models.Guest;
import com.vsu.hotel.data.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {
    private GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public void createPerson(Guest person){
        guestRepository.save(person);
    }

    public Guest findById(int id){
        return guestRepository.findById(id);
    }

    public List<Guest> findAll(){
        return guestRepository.findAll();
    }
}
