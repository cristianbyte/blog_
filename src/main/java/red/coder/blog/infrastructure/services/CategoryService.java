package red.coder.blog.infrastructure.services;

import red.coder.blog.domain.entities.Category;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import red.coder.blog.domain.repositories.CategoryRepo;
import red.coder.blog.infrastructure.abstract_services.ICategoryService;

@Service
@Transactional
@AllArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepo categoryRepo;

    @Override
    public List<String> findAll() {
        List<Category> categories = categoryRepo.findAll();
        return categories.stream()
                .map(Category::getName)
                .toList();
    }
}
