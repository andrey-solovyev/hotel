package com.vsu.hotel.service;

import com.vsu.hotel.data.models.Order;
import com.vsu.hotel.data.repository.OrderRepository;
import com.vsu.hotel.data.repository.RoomRepository;
import com.vsu.hotel.data.repository.impl.OrderRepositoryImp;
import com.vsu.hotel.data.repository.impl.RoomRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private RoomRepository roomRepository;

    public void addNewOrder(Order order){
        if (orderRepository.isFree(order.getArrivalDate(),order.getEndDate(),order.getHotelRoom().getId())){
            orderRepository.addOrder(order);
        }
    }
    public Order findOrderById(int id){
        return orderRepository.findById(id);
    }

    public List<Order> getALlOrders(){
        return orderRepository.allOrders();
    }
}
