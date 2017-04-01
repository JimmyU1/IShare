package com.ljn.controller;

import com.ljn.model.User;
import com.ljn.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by ljn19 on 2017-03-31.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @ResponseBody
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public ModelAndView signup(User user){
        ModelAndView mv = new ModelAndView("/jsp/user/signin.jsp");
        user.setPassword(new MD5().getMD5ofStr(user.getPassword()));
        userService.saveUser(user);
        mv.addObject("username", user.getUserName());
        return mv;
    }

}
