package cn.baseproject.programmer.service.admin;

import cn.baseproject.programmer.entity.admin.User;
import org.springframework.stereotype.Service;

/**
 * user用户service
 */
@Service
public interface IUserService {
    public User findByUsername(String username);
}
