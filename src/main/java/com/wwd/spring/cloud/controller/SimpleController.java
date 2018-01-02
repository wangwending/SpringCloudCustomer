package com.wwd.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wwd.spring.cloud.service.SimpleService;

/**
 * 
		* ClassName: SimpleController <br/>
		* Function: Simple Controller Called. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RestController
@RequestMapping("customer")
public class SimpleController {
	
	private final static Logger log = LoggerFactory.getLogger(SimpleController.class);
	
	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping("hello")
	public String hell() {
		simpleService.out();
		log.info("Cloud Customer Called Remote Method Success!!!");
		
		return "Cloud Customer Called Success";
	}
}
