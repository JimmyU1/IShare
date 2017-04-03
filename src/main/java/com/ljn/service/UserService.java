package com.ljn.service;

import com.ljn.model.User;

/**
 * Created by ljn19 on 2017-03-30.
 */
public interface UserService {
    /**
     * 数据库中是否存在这样的
     * @param user User对象
     * @return true or false
     */
    public boolean isExist(User user);

    /**
     * 从数据库中获取User对象
     * @param user User对象
     * @return User对象
     */
    public User getUser(User user);

    /**
     * 保存User对象到数据库
     * @param user 保存User对象到数据库
     */
    public void saveUser(User user);
}
