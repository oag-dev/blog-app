package uz.blog.blogapp.service.user;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.blog.blogapp.model.response.ApiResponse;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public ApiResponse addEntity(Object o) {
        return null;
    }

    @Override
    public Optional getEntityById(Integer id) {
        return Optional.empty();
    }

    @Override
    public ApiResponse editState(Integer id, Object o) {
        return null;
    }

    @Override
    public ApiResponse deleteEntityById(Integer id) {
        return null;
    }

    @Override
    public Page getEntiyPageBySort(Optional page, Optional size, Optional sortBy) {
        return null;
    }
}
