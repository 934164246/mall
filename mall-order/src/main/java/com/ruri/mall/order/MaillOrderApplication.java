package com.ruri.mall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MaillOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaillOrderApplication.class, args);
	}

}
