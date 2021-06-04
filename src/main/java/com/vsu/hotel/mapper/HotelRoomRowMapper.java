package com.vsu.hotel.mapper;

import com.vsu.hotel.data.models.HotelRoom;
import com.vsu.hotel.data.models.TypeRoom;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelRoomRowMapper implements RowMapper<HotelRoom> {
    @Override
    public HotelRoom mapRow(ResultSet resultSet, int i) throws SQLException {
        var room = new HotelRoom(
                resultSet.getInt("id"),
                resultSet.getDouble("cost"),
                resultSet.getInt("amountPeople"),
                TypeRoom.valueOf(resultSet.getString("type_room"))
        );
        return room;
    }
}
