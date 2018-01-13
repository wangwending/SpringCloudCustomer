package com.wwd.spring.cloud.service.impl;

import org.springframework.stereotype.Component;

import com.wwd.spring.cloud.service.DcClient;

@Component
public class DcClientFeignFallBack implements DcClient {

	@Override
	public String consumer() {
		return "Cloud Customer Call Remote Service consumer fail";
	}

}
