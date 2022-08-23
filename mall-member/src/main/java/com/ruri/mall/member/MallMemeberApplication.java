package com.ruri.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author GokouRuri
 */
@EnableFeignClients("com.ruri.mall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MallMemeberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallMemeberApplication.class, args);
	}

}
