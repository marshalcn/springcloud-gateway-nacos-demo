package org.example.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author madechao
 * @menu
 * @description
 * @createTime 15:01 2021/5/24
 */
@Controller
public class FallBackController {
    @ResponseBody
    @GetMapping("/fallback")
    public String fallBack(){

        return "error accord";
    }
}
