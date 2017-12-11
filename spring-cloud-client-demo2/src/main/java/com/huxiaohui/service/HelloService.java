package com.huxiaohui.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("spring-cloud-config-client")
public interface HelloService {
	@RequestMapping(value="/hello/{userName}",method=RequestMethod.GET)
	String getHello(@PathVariable(value="userName") String userName,@RequestParam(value="password",required=false) String password);
	
	@RequestMapping(value = "/getHello",method = RequestMethod.GET)
	String getGetHello();
}
