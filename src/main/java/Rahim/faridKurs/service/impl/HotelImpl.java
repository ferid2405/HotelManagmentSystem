package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.HotelPageResponse;
import Rahim.faridKurs.dto.HotelRequest;
import Rahim.faridKurs.dto.HotelResponse;
import Rahim.faridKurs.dto.mapper.HotelMapper;
import Rahim.faridKurs.entity.Hotel;
import Rahim.faridKurs.exception.HotelNotFound;
import Rahim.faridKurs.repository.HotelRepository;
import Rahim.faridKurs.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class HotelImpl implements HotelService {
   private final HotelRepository repository;
   private final HotelMapper hotelMapper;

    @Override
    public HotelPageResponse getAll(int page, int count) {
        Page<Hotel> hotels = repository.findAll(PageRequest.of(page, count));
        List<HotelResponse> productResponses = hotels
                .getContent()
                .stream()
                .map(hotelMapper::toHotelResponse)
                .toList();
       HotelPageResponse hotelPageResponse =
                new HotelPageResponse(
                        productResponses,
                        hotels.getTotalElements(),
                        hotels.getTotalPages(),
                        hotels.hasNext());
        return hotelPageResponse;
    }

    @Override
    public HotelPageResponse getByKabnetId(Integer id, int page, int count) {
        Page<Hotel> hotelPage= repository
                .findHotelByKabnetId(
                        id,
                        PageRequest.of(page, count));
        List<HotelResponse> hotelResponses = hotelPage
                .getContent()
                .stream()
                .map(hotelMapper::toHotelResponse)
                .toList();
       HotelPageResponse hotelPageResponse =
                new HotelPageResponse(
                        hotelResponses,
                        hotelPage.getTotalElements(),
                        hotelPage.getTotalPages(),
                        hotelPage.hasNext());
        return hotelPageResponse;
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
