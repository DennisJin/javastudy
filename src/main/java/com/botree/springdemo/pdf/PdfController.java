package com.botree.springdemo.pdf;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ibm on 18-11-8.
 */
@RestController
public class PdfController {

    @RequestMapping("/pdfdemo")
    public String index() throws Exception{
        Map<Object, Object> o=new HashMap<Object, Object>();
        //存入一个集合
        List<String> list = new ArrayList<String>();
        list.add("小明");
        list.add("张三");
        list.add("李四");
        o.put("name", "http://www.xdemo.org/");
        o.put("nameList", list);
        o.put("htmldemo","<span style=\"color: inherit;line-height: inherit;font-size: 15px;\">为了让 Java 程序员能将更多的精力放在基于网络通信的业务逻辑实现上，而不是过多的纠结于网络底层 NIO 的实现以及处理难以调试的网络问题，Netty 应运而生。</span><span style=\"color: inherit;line-height: inherit;font-size: 15px;\">为了让中间件开发者能将更多的精力放在产品功能特性实现上，而不是重复地一遍遍制造通信框架的轮子，SOFABolt 应运而生。</span>");
        String path=PdfHelper.getPath();

        PdfUtils.generateToFile(path, "pdf/tpl.ftl",path+"", o, "D:\\xdemo.pdf");
        return "hello world ";
    }

}
