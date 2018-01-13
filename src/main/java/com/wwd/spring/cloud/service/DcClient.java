package com.wwd.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wwd.spring.cloud.service.impl.DcClientFeignFallBack;

/**
 * 
		* ClassName: DcClient <br/>
		* Function: 调用Cloud远程服务. <br/>
		* @author wangwending
		* @since JDK 1.7
 */
@FeignClient(value = "provider", fallback=DcClientFeignFallBack.class)
public interface DcClient {
	
	@RequestMapping("/dc")
	String consumer();
}
