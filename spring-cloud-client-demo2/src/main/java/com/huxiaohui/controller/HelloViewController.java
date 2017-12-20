package com.huxiaohui.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huxiaohui.service.HelloService;

@Controller
public class HelloViewController {
	@Autowired
    private HelloService helloService;

    @RequestMapping("/getHelloFeign")
    public void from(HttpServletResponse response) {
    	response.setContentType("text/html"); 
    	try {
			response.getWriter().print(helloService.getGetHello());
		} catch (IOException e) {
			e.printStackTrace();
		} 
        return ;
    }
}
