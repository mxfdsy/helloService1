package com.cloud.hello1.feign;

import com.cloud.hello1.hello.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "feign-user")
public interface FeignService {

    @RequestMapping("/getFeignUser")
    User getFeignUser();
}
