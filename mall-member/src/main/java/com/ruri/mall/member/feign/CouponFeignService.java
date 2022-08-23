package com.ruri.mall.member.feign;

import com.ruri.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/test")
    public R memberCoupon();
}
