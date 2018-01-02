package com.wwd.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 
		* ClassName: DcClient <br/>
		* Function: 调用Cloud远程服务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@FeignClient("provider")
public interface DcClient {
	
	@PostMapping("/dc")
	String consumer();
}
