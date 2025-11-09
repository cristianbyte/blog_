package red.coder.blog.infrastructure.abstract_services;

import java.util.UUID;

import red.coder.api.dto.request.CategoryRequest;
import red.coder.api.dto.response.CategoryResponse;

public interface ICategoryService extends CrudService<CategoryRequest, CategoryResponse, UUID> {

}
