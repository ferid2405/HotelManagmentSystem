package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.mapper.HotelMapper;
import Rahim.faridKurs.entity.Hotel;
import Rahim.faridKurs.exception.HotelNotFound;
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
        return repository.findAll();
    }

    @Override
    public Hotel getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(()->new HotelNotFound("Bele bir hotel tapilmadi"));
    }

    @Override
    public void save(HotelRequest hotelRequest) {

    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Integer id, HotelRequest hotelRequest) {

    }
}
