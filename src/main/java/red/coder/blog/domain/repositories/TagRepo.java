package red.coder.blog.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import red.coder.blog.domain.entities.Tag;

public interface TagRepo extends JpaRepository<Tag, UUID> {

}
