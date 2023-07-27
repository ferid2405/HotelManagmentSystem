package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.ManagmentRequest;
import Rahim.faridKurs.dto.UserRequest;
import Rahim.faridKurs.entity.Managment;
import Rahim.faridKurs.entity.User;


import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(Integer id);
    void  save(UserRequest userRequest);
    void  delete(Integer id);
    void update(Integer id, UserRequest userRequest);
}
