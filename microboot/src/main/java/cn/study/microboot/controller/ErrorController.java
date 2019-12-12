package cn.study.microboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class ErrorController {
    @RequestMapping(value = "/get" ,method = RequestMethod.GET)
    @ResponseBody
    public String get(){
        System.out.println("除法计算：" + (10 / 0));
        return "hello world";
    }
}
