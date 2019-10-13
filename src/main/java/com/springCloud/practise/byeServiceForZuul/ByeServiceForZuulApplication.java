package com.springCloud.practise.byeServiceForZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ByeServiceForZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByeServiceForZuulApplication.class, args);
	}
	
	@RequestMapping("/")
	private String bye() {
		return "Bye";
	}

}
