package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.GuestRequest;
import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.entity.Guest;
import Rahim.faridKurs.entity.Hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> getAll();
    Hotel getById(Integer id);
    void save(HotelRequest hotelRequest);
    void  delete(Integer id);
    void update(Integer id, HotelRequest request);
}
