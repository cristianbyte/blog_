package red.coder.blog.infrastructure.abstract_services;

import red.coder.blog.api.dto.response.CategoryResponse;
import red.coder.blog.infrastructure.abstract_services.generic.ReadAllService;

public interface ICategoryService extends
        ReadAllService<CategoryResponse> {
}
