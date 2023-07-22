package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.UserRequest;
import Rahim.faridKurs.entity.User;
import Rahim.faridKurs.exception.UserNotFound;
import Rahim.faridKurs.repository.UserRepository;
import Rahim.faridKurs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private final UserRepository guestRepository;
    @Override
    public List<User> getAll() {
        return guestRepository.findAll();
    }

    @Override
    public User getById(Integer id) {
        return guestRepository.findById(id).orElseThrow(()->new UserNotFound("Musteri tapilmadi"));
    }

    @Override
    public void save(UserRequest guestRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, UserRequest request) {

    }
}
