package uz.blog.blogapp.entity.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;
import org.springframework.security.core.GrantedAuthority;
import uz.blog.blogapp.entity.enums.RoleName;

import javax.persistence.*;

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

    @Override
    public String getAuthority() {
        return this.name.name();
    }
}
