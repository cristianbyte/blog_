package red.coder.blog.infrastructure.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import red.coder.blog.api.dto.request.CategoryRequest;
import red.coder.blog.api.dto.response.CategoryResponse;
import red.coder.blog.domain.entities.Category;
import red.coder.blog.domain.repositories.CategoryRepo;
import red.coder.blog.infrastructure.abstract_services.ICategoryService;
import red.coder.blog.infrastructure.mapper.CategoryMapper;

@Service
@Transactional
@AllArgsConstructor
public class CategoryService implements ICategoryService {
    private final CategoryRepo categoryRepo;
    private final CategoryMapper categoryMapper;

    @Override
    public CategoryResponse create(CategoryRequest request) {
        Category category = categoryMapper.toEntity(request);
        return categoryMapper.toResponse(categoryRepo.save(category));
    }

    @Override
    public Optional<CategoryResponse> getById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Page<CategoryResponse> getAll(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public void deleteById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
}
