package red.coder.blog.infrastructure.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import red.coder.blog.api.dto.request.CategoryRequest;
import red.coder.blog.api.dto.response.CategoryResponse;
import red.coder.blog.domain.entities.Category;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "posts", ignore = true)
    Category toEntity(CategoryRequest request);

    CategoryResponse toResponse(Category category);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "posts", ignore = true)
    void toUpdate(CategoryRequest request, @MappingTarget Category category);

}
