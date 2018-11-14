package com.botree.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ibm on 17-10-18.
 */
@RestController
public class HelloController {

    @Value("${book.desc}")
    String bookDesc;

    @RequestMapping("/hello")
    public String index(){
        return "hello world "+bookDesc;
    }

}
