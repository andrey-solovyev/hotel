package com.vsu.hotel.configuration;

import com.vsu.hotel.data.models.Guest;
import com.vsu.hotel.data.repository.GuestRepository;
import com.vsu.hotel.data.repository.OrderRepository;
import com.vsu.hotel.data.repository.RoomRepository;
import com.vsu.hotel.data.repository.impl.GuestRepositoryImp;
import com.vsu.hotel.data.repository.impl.OrderRepositoryImp;
import com.vsu.hotel.data.repository.impl.RoomRepositoryImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotelConfiguration {
    @Bean
    public OrderRepository getOrderRepository(){
        return new OrderRepositoryImp();
    }
    @Bean
    public RoomRepository getRoomRepository(){
        return new RoomRepositoryImp();
    }
    @Bean
    public GuestRepository getGuestRepository(){
        return new GuestRepositoryImp();
    }

}
