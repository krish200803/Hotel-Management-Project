package com.example.Hotel.Management.System.dao;

import com.example.Hotel.Management.System.Entity.Hotel;

public interface HotelDAO {

    public void save();

    public Hotel findByID(int id);

    public void updateAddress(int id);

    public void deleteById(int id);

    public void deleteByPhone(long phoneno);
}
