package com.cxs.springcloud.dubbo.Controller;

import com.cxs.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @DubboReference
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello("CXS");
    }
}
