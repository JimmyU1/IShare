package com.ljn.service.impl;

import com.ljn.model.User;
import com.ljn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * Created by ljn19 on 2017-03-30.
 */
@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Override
    public boolean isExist(User user) {
        return false;
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
}
