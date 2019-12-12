package cn.study.microboot.controller;

import cn.study.microboot.service.impl.DeptServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class HelloController {
    @Resource
    private DeptServiceImpl deptService;
    @RequestMapping("/mybatis")
    public void testList() throws Exception {
        System.out.println(this.deptService.list());
    }
}
