package com.ljn.controller;

import com.ljn.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Controller
@RequestMapping("/base")
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
