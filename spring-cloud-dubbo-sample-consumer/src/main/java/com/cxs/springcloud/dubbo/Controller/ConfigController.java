package com.cxs.springcloud.dubbo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {
    @Value("${max}")
    private int max;
    @Value("${min}")
    private int min;

    @GetMapping("/config")
    public String getName() {
        return String.valueOf(max + min);
    }
}
