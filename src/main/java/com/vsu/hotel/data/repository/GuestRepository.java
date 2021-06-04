package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Integer> {
    Guest findById(int id);

    List<Guest> findAll();

    Guest findByName(String name);

}
