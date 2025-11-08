package red.coder.blog.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import red.coder.blog.domain.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

}
