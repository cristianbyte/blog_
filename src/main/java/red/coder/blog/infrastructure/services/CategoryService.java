package red.coder.blog.infrastructure.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import red.coder.api.dto.request.CategoryRequest;
import red.coder.api.dto.response.CategoryResponse;
import red.coder.blog.domain.repositories.CategoryRepo;
import red.coder.blog.infrastructure.abstract_services.ICategoryService;

@Service
@Transactional
@AllArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepo categoryRepo;

    @Override
    public CategoryResponse create(CategoryRequest request) {
        var category = categoryRepo.save(request.toEntity());
        return CategoryResponse.builder()
                .id(category.getId().toString())
                .name(category.getName())
                .build();
    }
}
