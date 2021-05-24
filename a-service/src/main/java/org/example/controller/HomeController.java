package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author madechao
 * @menu
 * @description
 * @createTime 14:12 2021/5/21
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
