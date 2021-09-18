package uz.blog.blogapp.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.blog.blogapp.entity.enums.RoleName;
import uz.blog.blogapp.entity.role.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {

    RoleEntity findByName(RoleName name);
}
