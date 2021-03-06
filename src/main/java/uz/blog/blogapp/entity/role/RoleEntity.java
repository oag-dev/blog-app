package uz.blog.blogapp.entity.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;
import org.springframework.security.core.GrantedAuthority;
import uz.blog.blogapp.entity.enums.role.RoleName;
import uz.blog.blogapp.entity.privilege.PrivilegeEntity;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
@Entity(name = "role")
public class RoleEntity implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    RoleName name;

    @ManyToMany
    Set<PrivilegeEntity> privilegeEntities;

    @Override
    public String getAuthority() {
        return this.name.name();
    }
}
