package com.ljn.controller;

import com.ljn.model.Basebook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

/**
 * Created by ljn19 on 2017-03-31.
 */
@Controller
@RequestMapping("/basebook")
public class BasebookController extends BaseController {

    @ResponseBody
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView searchBasebook(@RequestParam("isbn13") String isbn13) {
        System.out.println("isbn13 : " + isbn13);
        Basebook basebook = null;
        try {
            basebook = basebookService.getBasebookByURL(isbn13);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(basebook.toString());
        ModelAndView mav = new ModelAndView("/WEB-INF/jsp/basebook/search.jsp");
        mav.addObject("basebook", basebook);
        return mav;
    }
}
