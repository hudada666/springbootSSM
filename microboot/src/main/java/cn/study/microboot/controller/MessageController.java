package cn.study.microboot.controller;

import cn.study.microboot.util.controller.AbstractBaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class MessageController extends AbstractBaseController {
    @RequestMapping(value = "/echo1", method = RequestMethod.GET)
//    public String echo(String mid){
//        System.out.println("【*** 访问地址 ***】" + super.getMessage("member.add.action"));
//        return super.getMessage("welcome.msg",mid);
//}
    public String show(String mid, Model model){
        //request属性传递包装
        model.addAttribute("url","www.study.cn");
        //request属性传递包装
        model.addAttribute("mid",mid);
        return "message/message_show.html";
    }

}
