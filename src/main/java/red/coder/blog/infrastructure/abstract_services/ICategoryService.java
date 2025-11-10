package red.coder.blog.infrastructure.abstract_services;

import java.util.UUID;

import red.coder.blog.api.dto.request.CategoryRequest;
import red.coder.blog.api.dto.response.CategoryResponse;
import red.coder.blog.infrastructure.abstract_services.generic.CreateService;
import red.coder.blog.infrastructure.abstract_services.generic.DeleteService;
import red.coder.blog.infrastructure.abstract_services.generic.ReadAllService;
import red.coder.blog.infrastructure.abstract_services.generic.ReadService;

public interface ICategoryService extends
        CreateService<CategoryRequest, CategoryResponse>,
        ReadService<CategoryResponse, UUID>,
        ReadAllService<CategoryResponse>,
        DeleteService<UUID> {
}
