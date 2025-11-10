package red.coder.blog.infrastructure.abstract_services.generic;

public interface DeleteService<Id> {
    void deleteById(Id id);
}
