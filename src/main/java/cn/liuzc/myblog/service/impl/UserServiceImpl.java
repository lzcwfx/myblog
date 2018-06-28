package cn.liuzc.myblog.service.impl;

import cn.liuzc.myblog.dao.UserDao;
import cn.liuzc.myblog.model.User;
import cn.liuzc.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int register(User user) {
        return userDao.insertUser(user);
    }
}
