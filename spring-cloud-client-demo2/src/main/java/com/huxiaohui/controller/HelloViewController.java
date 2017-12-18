package com.huxiaohui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huxiaohui.service.HelloService;

@Controller
public class HelloViewController {
	@Autowired
    private HelloService helloService;

    @RequestMapping("/getHelloFeign")
    public String from() {
        return helloService.getGetHello();
    }
}
