package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.Order;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public interface OrderRepository {
    boolean isFree(Date arrivalDate, Date endDate, int id);
    Order findById(int id);
    void addOrder(Order order);
    List<Order> allOrders();

}
