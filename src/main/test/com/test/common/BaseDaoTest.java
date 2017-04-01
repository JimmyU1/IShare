package com.test.common;

import com.ljn.dao.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ljn19 on 2017-04-01.
 */
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BaseDaoTest {
    @Resource
    protected UserDao userDao;

    @Resource
    protected BasebookDao basebookDao;

    @Resource
    protected BorrowDao borrowDao;

    @Resource
    protected CategoryDao categoryDao;

    @Resource
    protected ContactDao contactDao;

    @Resource
    protected OwnershipDao ownershipDao;

    @Resource
    protected ReviewDao reviewDao;
}
