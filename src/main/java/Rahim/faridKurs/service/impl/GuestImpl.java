package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.GuestRequest;
import Rahim.faridKurs.entity.Guest;
import Rahim.faridKurs.exception.GuestNotFound;
import Rahim.faridKurs.repository.GuestRepository;
import Rahim.faridKurs.service.GuestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GuestImpl implements GuestService {
    private final GuestRepository guestRepository;
    @Override
    public List<Guest> getAll() {
        return guestRepository.findAll();
    }

    @Override
    public Guest getById(Integer id) {
        return guestRepository.findById(id).orElseThrow(()->new GuestNotFound("Musteri tapilmadi"));
    }

    @Override
    public void save(GuestRequest guestRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, GuestRequest request) {

    }
}
