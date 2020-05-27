package cn.baseproject.programmer.dao.admin;

import cn.baseproject.programmer.entity.admin.User;
import org.springframework.stereotype.Repository;

/**
 * user用户dao
 */
@Repository
public interface IUserDao {
    public User findByUsername(String username);
}
