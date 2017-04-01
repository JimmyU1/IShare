package com.ljn.service;

import com.ljn.model.User;

/**
 * Created by ljn19 on 2017-03-30.
 */
public interface UserService {
    /**
     * 数据库中是否存在这样的
     * @param user
     * @return
     */
    public boolean isExist(User user);

    public void saveUser(User user);
}
