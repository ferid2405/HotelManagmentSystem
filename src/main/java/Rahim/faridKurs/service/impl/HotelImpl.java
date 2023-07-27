package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.mapper.HotelMapper;
import Rahim.faridKurs.entity.Hotel;
import Rahim.faridKurs.repository.HotelRepository;
import Rahim.faridKurs.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class HotelImpl implements HotelService {
   private final HotelRepository repository;
   private final HotelMapper hotelMapper;

    @Override
    public List<Hotel> getAll() {
        return null;
    }

    @Override
    public Hotel getById(Integer id) {
        return null;
    }

    @Override
    public void save(HotelRequest hotelRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, HotelRequest hotelRequest) {

    }
}
