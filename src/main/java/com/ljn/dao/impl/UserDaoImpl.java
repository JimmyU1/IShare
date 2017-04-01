package com.ljn.dao.impl;

import com.ljn.dao.UserDao;
import com.ljn.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by ljn19 on 2017/3/5.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
