package red.coder.blog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import red.coder.blog.infrastructure.abstract_services.ICategoryService;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "/categories")
@AllArgsConstructor
public class CategoryController {

    @Autowired
    private final ICategoryService categoryService;

    @GetMapping
    public List<String> getAll() {
        return categoryService.findAll();
    }
}
