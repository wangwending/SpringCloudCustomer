package com.wwd.spring.cloud.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * 
		* ClassName: CloudCustomerApplication <br/>
		* Function: CLoud Customer Start . <br/>
		* @author wangwending
		* @since JDK 1.7
 */
//@SpringBootApplication
//@EnableFeignClients
//@EnableDiscoveryClient
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(value = {"com.wwd"})
public class CloudCustomerApplication {
	
	private final static Logger log = LoggerFactory.getLogger(CloudCustomerApplication.class);
	
	@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(CloudCustomerApplication.class, args);
		log.info("CLoud Customer Start Success!!!");
	}
}
