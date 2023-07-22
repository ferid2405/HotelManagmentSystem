package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.WorkersRequest;
import Rahim.faridKurs.entity.Hotel;
import Rahim.faridKurs.entity.Workers;

import java.util.List;

public interface WorkersService {

    List<Workers> getAll();
    Workers getById(Integer id);
    void save(WorkersRequest workersRequest);
    void  delete(Integer id);
    void update(Integer id, WorkersRequest request);
}
