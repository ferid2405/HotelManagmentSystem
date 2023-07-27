package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.UserRequest;
import Rahim.faridKurs.entity.User;
import Rahim.faridKurs.repository.UserRepository;
import Rahim.faridKurs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class UserImpl implements UserService {
    private  final UserRepository repository;

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public void save(UserRequest userRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, UserRequest userRequest) {

    }
}
