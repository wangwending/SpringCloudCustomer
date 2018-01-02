package com.wwd.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
		* ClassName: SimpleService <br/>
		* Function: Remote Service. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
//@FeignClient("provider")
public interface SimpleService {
	//@RequestMapping("simple/out")
	String out();
}
