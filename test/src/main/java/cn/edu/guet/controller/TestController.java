package cn.edu.guet.controller;

import cn.edu.guet.bean.User;
import cn.edu.guet.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testServiceImpl;

    @RequestMapping("/test")
    public String test(){
        User user = testServiceImpl.test();
        return "hello world";
    }

}
