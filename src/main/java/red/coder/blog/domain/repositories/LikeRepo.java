package red.coder.blog.domain.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import red.coder.blog.domain.entities.Like;

@Repository
public interface LikeRepo extends JpaRepository<Like, UUID> {

}
