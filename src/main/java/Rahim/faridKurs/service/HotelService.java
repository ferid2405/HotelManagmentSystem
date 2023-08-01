package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.HotelPageResponse;
import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.UserRequest;
import Rahim.faridKurs.entity.Hotel;


import java.util.List;

public interface HotelService {
    HotelPageResponse getAll(int page, int count);

    HotelPageResponse getByKabnetId(Integer id, int page, int count);
    Hotel getById(Integer id);
    void  save(HotelRequest hotelRequest);
    void  delete(Integer id);
    void update(Integer id, HotelRequest hotelRequest);
}
