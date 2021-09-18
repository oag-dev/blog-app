package uz.blog.blogapp.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.blog.blogapp.entity.product.ProductEntity;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
