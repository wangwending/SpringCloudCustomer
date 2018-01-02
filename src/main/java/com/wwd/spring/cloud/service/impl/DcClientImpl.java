package com.wwd.spring.cloud.service.impl;

import org.springframework.stereotype.Service;

import com.wwd.spring.cloud.service.DcClient;

@Service
public class DcClientImpl implements DcClient {

	@Override
	public String consumer() {
		return "Cloud Customer Call Remote Service consumer";
	}

}
