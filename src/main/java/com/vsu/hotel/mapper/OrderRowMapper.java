package com.vsu.hotel.mapper;

import com.vsu.hotel.data.models.Guest;
import com.vsu.hotel.data.models.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.rowset.CachedRowSet;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OrderRowMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        var order = new Order(
                resultSet.getInt("id"),
                resultSet.getDate("date_create_order"),
                new HotelRoomRowMapper().mapRow(resultSet, i),
                resultSet.getBoolean("isBooked_by_internet"),
                BeanPropertyRowMapper.newInstance(Guest.class).mapRow(resultSet,i),
                resultSet.getDate("arrival_date"),
                resultSet.getDate("end_date")
        );
        return order;
    }
}
