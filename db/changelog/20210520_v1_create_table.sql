CREATE TYPE hotel_Type AS ENUM ('luxury','junior_suite','single','simple_double','sofa_double');
CREATE TABLE room(
    id SERIAL PRIMARY KEY,
    cost REAL NOT NULL,
    amount_people INT NOT NULL,
    room_type hotel_type
    );
CREATE TABLE person(
    id SERIAL PRIMARY KEY,
    guest_name VARCHAR (50) NOT NULL,
    guest_surname VARCHAR (50) NOT NULL,
    birthday DATE NOT NULL,
    passport_data VARCHAR(60) NOT NULL
    );
CREATE TABLE order_room(
    id SERIAL PRIMARY KEY,
    date_create_order TIMESTAMP NOT NULL,
    room_id INT NOT NULL,
    isBooked_by_internet BOOLEAN NOT NULL,
    person_id INT NOT NULL,
    arrival_date DATE NOT NULL,
    end_date DATE NOT NULL,
    FOREIGN KEY (room_id) REFERENCES room(id),
    FOREIGN KEY (person_id) REFERENCES person(id)
    );
