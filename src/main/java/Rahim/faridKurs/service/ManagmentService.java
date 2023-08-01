package Rahim.faridKurs.service;

import Rahim.faridKurs.dto.ManagmentRequest;
import Rahim.faridKurs.entity.Managment;

import java.util.List;

public interface ManagmentService {
    List<Managment> getAll();
    Managment getById(Integer id);
    void  save(ManagmentRequest managmentRequest);
    void  delete(Integer id);
    void update(Integer id,ManagmentRequest managmentRequest);

}
