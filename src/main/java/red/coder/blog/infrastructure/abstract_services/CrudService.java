package red.coder.blog.infrastructure.abstract_services;

import red.coder.blog.infrastructure.abstract_services.generic.CreateService;

public interface CrudService<Request, Response, Id> extends CreateService<Request, Response> {

}
