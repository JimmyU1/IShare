package com.ljn.controller;

import com.ljn.model.Contact;
import com.ljn.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.acl.Owner;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Controller
public class BaseController {
    @Resource
    protected BasebookService basebookService;

    @Resource
    protected  BorrowService borrowService;

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
