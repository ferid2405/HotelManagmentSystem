package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.entity.Kabnet;
import Rahim.faridKurs.repository.KabnetRepository;
import Rahim.faridKurs.service.KabnetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KabnetImpl implements KabnetService {
    private final KabnetRepository repository;
    @Override
    public List<Kabnet> getAll() {
        return repository.findAll();
    }
}
