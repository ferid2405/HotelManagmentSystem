package Rahim.faridKurs.service.impl;

import Rahim.faridKurs.entity.Category;
import Rahim.faridKurs.repository.CategoryRepository;
import Rahim.faridKurs.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public List<Category> getAll() {
        return null;
    }
}
