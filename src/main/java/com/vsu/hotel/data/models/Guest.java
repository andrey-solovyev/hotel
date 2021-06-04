package com.vsu.hotel.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
    private int id;
    /**Имя гостя**/
    private String name;
    /**Фамилия гостя**/
    private String surname;
    /**Дата рождения**/
    private Date birthdate;
    /**Паспортные данные**/
    private String passport;
}
