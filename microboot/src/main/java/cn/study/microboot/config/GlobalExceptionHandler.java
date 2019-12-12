package cn.study.microboot.config;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

//@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
    //默认的全局异常的处理页面
    public static final String DEFAULT_ERROR_VIEW = "message/error";

    @ExceptionHandler(Exception.class)
    public Object defaultErrorHandler(HttpServletRequest request, Exception e) {
        class ErrorInfo{
            private Integer code;
            private String url;
            private String message;

            public Integer getCode() {
                return code;
            }

            public void setCode(Integer code) {
                this.code = code;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }
        }
        ErrorInfo info = new ErrorInfo();
        info.setCode(100);
        info.setUrl(request.getRequestURI().toString());
        info.setMessage(e.getMessage());
        return info;
    }
       /* //设置跳转路径
        ModelAndView mav = new ModelAndView(DEFAULT_ERROR_VIEW);
        //传递异常对象
        mav.addObject("exception",e);
        //获取请求路径
        mav.addObject("url",request.getRequestURI());
        return mav;
    }*/
}
