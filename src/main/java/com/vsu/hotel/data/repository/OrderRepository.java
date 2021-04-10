package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.Order;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Component
public interface OrderRepository {
    boolean isFree(Calendar arrivalDate, Calendar endDate, UUID uuid);
    Order findById(UUID uuid);
    void addOrder(Order order);
    List<Order> allOrders();
}
