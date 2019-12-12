package cn.study.microboot.controller;

import java.util.Iterator;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.study.microboot.util.controller.AbstractBaseController;
import cn.study.microboot.vo.Member;

@Controller
public class MemberController extends AbstractBaseController {
    @RequestMapping(value = "/addPre",method = RequestMethod.GET)
    public String addPre(){ // 增加前的准备操作路径
        return "message/member_add";
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Object add(@Valid Member vo, BindingResult bindingResult){
        // 现在表示执行的验证出现错误
        if (bindingResult.hasErrors()){
            // 获取全部错误信息
            Iterator<ObjectError> iterator = bindingResult.getAllErrors().iterator();
            // 现在表示执行的验证出现错误
            if (iterator.hasNext()){
                ObjectError error = iterator.next();
                System.out.println("【错误信息】code = " + error.getCode() + "，message = " + error.getDefaultMessage());
            }
            return bindingResult.getAllErrors();
        }else{
            return vo;
        }
    }
}
