package uz.blog.blogapp.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.blog.blogapp.entity.user.UserEntity;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    boolean existsByUsername(String username);

    Optional<UserEntity> findByUsernameAndEmailCode(String username, String emailCode);

    Optional<UserEntity> findByUsername(String username);
}
