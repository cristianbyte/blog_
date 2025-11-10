package red.coder.blog.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import red.coder.blog.infrastructure.abstract_services.ITagService;

@RestController
@RequestMapping(path = "/tags")
@AllArgsConstructor
public class TagController implements ITagService {

    @Autowired
    private final ITagService tagService;

    @GetMapping
    public List<String> findAll() {
        return tagService.findAll();
    }

}
