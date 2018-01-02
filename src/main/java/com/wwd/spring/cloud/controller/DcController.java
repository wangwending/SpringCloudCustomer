package com.wwd.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wwd.spring.cloud.service.DcClient;

/**
 * 
		* ClassName: DcController <br/>
		* Function: 调用Cloud服务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@RestController
public class DcController {

	private static final Logger log = LoggerFactory.getLogger(DcController.class);
	
	@Autowired
	private DcClient dcClient;
	
	@RequestMapping("consumer")
	public String dc() {
		log.info("Cloud Customer Success");
		return dcClient.consumer();
	}
}
