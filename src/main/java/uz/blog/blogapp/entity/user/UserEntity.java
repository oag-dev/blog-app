package uz.blog.blogapp.entity.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
@Entity
@Table(name = "users")
public class UserEntity   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

}
