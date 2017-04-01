package com.test.dao;

import com.ljn.model.User;
import com.ljn.util.MD5;
import com.test.common.BaseTest;
import org.junit.Test;
import org.springframework.test.context.transaction.TransactionConfiguration;

import java.util.UUID;

/**
 * Created by ljn19 on 2017/3/5.
 */
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class UserDaoTest extends BaseTest{

    @Test
    public void saveUser(){
        User user = new User();
        user.setUserId("82900016");
        user.setUserName("刘佳宁");
        user.setPassword(new MD5().getMD5ofStr("shouhu1314"));
        user.setCompany("CRSC");
        user.setDepartment("研究院");
        user.setIsAffirm(false);
        System.out.println(user.getId());
        userDao.save(user);
    }
}
