package com.ljn.service.impl;

import com.ljn.model.User;
import com.ljn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ljn19 on 2017-03-30.
 */
@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Override
    public boolean isExist(User user) {
        String hql = "from User where userId =:userId";
        Map<String, Object> params = new HashMap<>();
        params.put("userId", user.getUserId());
        User userResult = (User) userDao.get(hql, params);
        if(userResult != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public User getUser(User user) {
        String hql = "from User where userId =:userId and password =:password";
        Map<String, Object> params = new HashMap<>();
        params.put("userId", user.getUserId());
        params.put("password", user.getPassword());
        User userResult = (User) userDao.get(hql, params);
        return userResult;
    }

    @Override
    public void saveUser(User user) {
        user.setGmtCreate(new Timestamp(new Date().getTime()));
        userDao.save(user);
    }
}
