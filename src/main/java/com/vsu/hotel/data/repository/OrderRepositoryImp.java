package com.vsu.hotel.data.repository;

import com.vsu.hotel.data.models.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;
@Repository
public class OrderRepositoryImp implements OrderRepository {
    private List<Order> orders;

    public OrderRepositoryImp() {
        orders= new ArrayList<>();
    }
    public boolean isFree(Calendar startDate, Calendar endDate, UUID uuidRoom){
        for (Order o:getOrders()){
            if (!(o.uuid.equals(uuidRoom) && (o.getArrivalDate().before(startDate) && o.getArrivalDate().before(endDate) || o.getEndDate().after(endDate)))){
                return false;
            }
        }
        return true;
    }
    public void addOrder(Order order){
        getOrders().add(order);
    }
    public Order getById(UUID uuid){
        for (Order o:getOrders()){
            if (o.getUuid().equals(uuid)){
                return o;
            }
        }
        return null;
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
