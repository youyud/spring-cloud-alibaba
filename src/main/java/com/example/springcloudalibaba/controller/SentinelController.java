package com.example.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2019/08/15 15:57
 */
@RestController
public class SentinelController {
    @GetMapping("/hello")
    @SentinelResource("resource")
    public String hello() {
        return "Hello";
    }
}
