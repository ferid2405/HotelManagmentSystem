package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.UserRequest;
import Rahim.faridKurs.entity.Hotel;


import java.util.List;

public interface HotelService {
    List<Hotel> getAll();
    Hotel getById(Integer id);
    void  save(HotelRequest hotelRequest);
    void  delete(Integer id);
    void update(Integer id, HotelRequest hotelRequest);
}
