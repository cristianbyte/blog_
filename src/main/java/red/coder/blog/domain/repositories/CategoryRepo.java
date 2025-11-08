package red.coder.blog.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import red.coder.blog.domain.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, UUID> {

}
