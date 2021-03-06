package com.huxiaohui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huxiaohui.service.HelloService;

@RestController
public class HelloController {
	@Autowired
    private HelloService helloService;

    @RequestMapping("/helloFeign/{userName}")
    public String from(@PathVariable String userName) {
        return helloService.getHello(userName,"sdsdsd");
    }
}
