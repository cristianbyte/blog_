package red.coder.blog.infrastructure.abstract_services;

import red.coder.blog.infrastructure.abstract_services.generic.CreateService;
import red.coder.blog.infrastructure.abstract_services.generic.DeleteService;
import red.coder.blog.infrastructure.abstract_services.generic.ReadAllService;
import red.coder.blog.infrastructure.abstract_services.generic.ReadService;
import red.coder.blog.infrastructure.abstract_services.generic.UpdateService;

public interface CrudService<Request, Response, Id> extends
        CreateService<Request, Response>,
        ReadService<Response, Id>,
        ReadAllService<Response>,
        UpdateService<Request, Response, Id>,
        DeleteService<Id> {

}
