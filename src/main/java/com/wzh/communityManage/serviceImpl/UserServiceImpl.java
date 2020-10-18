package com.wzh.communityManage.serviceImpl;

import com.wzh.communityManage.dao.UserDao;
import com.wzh.communityManage.entity.User;
import com.wzh.communityManage.entity.UserExample;
import com.wzh.communityManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        userDao.insert(user);
        return 1;
    }
}
