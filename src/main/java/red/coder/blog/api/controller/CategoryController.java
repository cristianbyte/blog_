package red.coder.blog.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import red.coder.blog.api.dto.request.CategoryRequest;
import red.coder.blog.api.dto.response.CategoryResponse;
import red.coder.blog.infrastructure.abstract_services.ICategoryService;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping(path = "/categories")
@AllArgsConstructor
public class CategoryController {

    @Autowired
    private final ICategoryService categoryService;

    @PostMapping
    public ResponseEntity<CategoryResponse> create(@Validated @RequestBody CategoryRequest request) {
        return ResponseEntity.ok(this.categoryService.create(request));
    }
}
