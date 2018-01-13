package com.wwd.spring.cloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

	@Override
	public void dc() {
		restTemplate.getForObject("http://provider/dc", String.class);
	}

}
