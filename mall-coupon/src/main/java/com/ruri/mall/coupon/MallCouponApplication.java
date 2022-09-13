package com.ruri.mall.coupon;

import com.ruri.mall.coupon.controller.CouponController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author GokouRuri
 */
@EnableDiscoveryClient
@MapperScan("com.ruri.mall.coupon.dao")
@SpringBootApplication
public class MallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallCouponApplication.class, args);
	}

}
