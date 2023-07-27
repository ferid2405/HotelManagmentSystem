package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.dto.ManagmentRequest;
import Rahim.faridKurs.entity.Managment;
import Rahim.faridKurs.repository.ManagmentRepository;
import Rahim.faridKurs.service.ManagmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagmentImpl implements ManagmentService {
    private final ManagmentRepository managmentRepository;
    @Override
    public List<Managment> getAll() {
        return null;
    }

    @Override
    public Managment getById(Integer id) {
        return null;
    }

    @Override
    public void save(ManagmentRequest managmentRequest) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id, ManagmentRequest managmentRequest) {

    }
}
