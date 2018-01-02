package com.wwd.spring.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.wwd.spring.cloud.service.SimpleService;

@Service
public class SimpleServiceImpl implements SimpleService {

	@Autowired
    private RestTemplate restTemplate;
	
	@Override
	public String out() {
		return restTemplate.getForObject("http://provider/simple/out", String.class);
	}

}
