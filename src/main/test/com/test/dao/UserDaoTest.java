package com.test.dao;

import com.ljn.model.User;
import com.ljn.util.MD5;
import com.test.common.BaseDaoTest;
import org.junit.Test;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by ljn19 on 2017/3/5.
 */
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class UserDaoTest extends BaseDaoTest {

    @Test
    public void saveUser(){
        User user = new User();
        user.setUserId("82900017");
        user.setUserName("刘佳宁");
        user.setPassword(new MD5().getMD5ofStr("shouhu1314"));
        user.setCompany("CRSC");
        user.setDepartment("研究院");
        user.setIsAffirm(false);
        System.out.println(user.getId());
        userDao.save(user);
    }
}
