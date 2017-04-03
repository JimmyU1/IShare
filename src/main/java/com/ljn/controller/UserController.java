package com.ljn.controller;

import com.ljn.model.User;
import com.ljn.util.MD5;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


/**
 * Created by ljn19 on 2017-03-31.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @ResponseBody
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public ModelAndView signUp(User user) {
        ModelAndView mv = new ModelAndView("/jsp/user/signin.jsp");
        user.setPassword(new MD5().getMD5ofStr(user.getPassword()));
        userService.saveUser(user);
        mv.addObject("username", user.getUserName());
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public ModelAndView signIn(User loginUser, HttpSession session) {

        if (userService.isExist(loginUser)) {
            loginUser.setPassword(new MD5().getMD5ofStr(loginUser.getPassword()));
            User user = userService.getUser(loginUser);
            if (user != null) {
                session.setAttribute("user", user);
                return new ModelAndView("redirect:/user/index");
            } else {
                session.setAttribute("errorMsg", "用户名或密码错误");
                return new ModelAndView("redirect:/user/index");
            }
        } else {
            session.setAttribute("errorMsg", "用户不存在");
            return new ModelAndView("redirect:/user/index");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(){
        return new ModelAndView("/WEB-INF/jsp/common/index.jsp");
    }

}
