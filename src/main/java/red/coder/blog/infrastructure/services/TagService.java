package red.coder.blog.infrastructure.services;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import red.coder.blog.domain.repositories.TagRepo;
import red.coder.blog.infrastructure.abstract_services.ITagService;

@Service
@Transactional
@AllArgsConstructor
public class TagService implements ITagService {

    private final TagRepo tagRepo;

    @Override
    public List<String> findAll() {
        return tagRepo.findAll()
                .stream()
                .map(tag -> tag.getName())
                .toList();
    }

}
