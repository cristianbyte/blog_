package red.coder.blog.infrastructure.abstract_services.generic;

import java.util.List;

public interface ReadAllService<Response> {
    List<Response> findAll();
}
