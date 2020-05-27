package cn.baseproject.programmer.service.admin.impl;

import cn.baseproject.programmer.dao.admin.IUserDao;
import cn.baseproject.programmer.entity.admin.User;
import cn.baseproject.programmer.service.admin.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user用户serviceimpl
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
