package com.test.common;

import com.ljn.model.Ownership;
import com.ljn.service.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by ljn19 on 2017-04-01.
 */
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-hibernate.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class BaseServiceTest {
    @Resource
    protected BasebookService basebookService;

    @Resource
    protected BorrowService borrowService;

    @Resource
    protected CategoryService categoryService;

    @Resource
    protected ContactService contactService;

    @Resource
    protected OwnershipService ownershipService;

    @Resource
    protected ReviewService reviewService;

    @Resource
    protected UserService userService;
}
