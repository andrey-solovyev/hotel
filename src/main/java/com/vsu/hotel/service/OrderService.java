package com.vsu.hotel.service;

import com.vsu.hotel.data.models.Order;
import com.vsu.hotel.data.repository.OrderRepositoryImp;
import com.vsu.hotel.data.repository.RoomRepositoryImp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepositoryImp orderRepositoryImp;
    private RoomRepositoryImp roomRepositoryImp;

    public OrderService(OrderRepositoryImp orderRepositoryImp, RoomRepositoryImp roomRepositoryImp) {
        this.orderRepositoryImp = orderRepositoryImp;
        this.roomRepositoryImp = roomRepositoryImp;
    }
    public void addNewOrder(Order order){
        if (orderRepositoryImp.isFree(order.getArrivalDate(),order.getEndDate(),order.getHotelRoom().getUuid())){
            orderRepositoryImp.addOrder(order);
        }
    }
    public List<Order> getALlOrders(){
        return orderRepositoryImp.getOrders();
    }
}
