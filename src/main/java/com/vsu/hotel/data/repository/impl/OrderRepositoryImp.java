package com.vsu.hotel.data.repository.impl;

import com.vsu.hotel.data.models.Order;
import com.vsu.hotel.data.repository.OrderRepository;
import com.vsu.hotel.mapper.OrderRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Repository
public class OrderRepositoryImp implements OrderRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean isFree(Date arrivalDate, Date endDate, int id) {
        return jdbcTemplate.queryForObject("SELECT o, CASE WHEN (o.arrival_date NOT BETWEEN ? AND ?) AND (o.arrival_date NOT BETWEEN ? AND ?) THEN true ELSE false END FROM order_room o WHERE o.room_id = ?"
                , new Object[]{arrivalDate,endDate, arrivalDate,endDate,id}, Boolean.class);
    }

    @Override
    public Order findById(int id) {
        return jdbcTemplate.queryForObject("SELECT o FROM order_room o WHERE o.id = ?"
                , new Object[]{id},(rs,i)->new OrderRowMapper().mapRow(rs,i));
    }

    @Override
    public void addOrder(Order order) {
        jdbcTemplate.update("INSERT INTO order_room(date_create_order, room_id, isbooked_by_internet, person_id, arrival_date, end_date)  VALUES (?,?,?,?,?,?)",
                new Object[]{order.getDateCreateOrder(),order.getHotelRoom().getId(),order.getArrivalDate(),order.getEndDate()});
    }

    @Override
    public List<Order> allOrders() {
        return jdbcTemplate.query("SELECT * FROM order_room",(rs,i) -> new OrderRowMapper().mapRow(rs,i));
    }
}
