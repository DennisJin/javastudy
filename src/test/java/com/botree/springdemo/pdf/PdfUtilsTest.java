package com.botree.springdemo.pdf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ibm on 18-11-8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PdfUtilsTest {

    @Test
    public void testConvertPdf() {
        try {

            Map<Object, Object> o=new HashMap<Object, Object>();
            //存入一个集合
            List<String> list = new ArrayList<String>();
            list.add("小明");
            list.add("张三");
            list.add("李四");
            o.put("name", "http://www.xdemo.org/");
            o.put("nameList", list);
            o.put("htmldemo","<span style=\"color: inherit;line-height: inherit;font-size: 15px;\">为了让Java程序员能将更多的精力放在基于网络通信的业务逻辑实现上</span><span style=\"color: inherit;line-height: inherit;font-size: 15px;\">为了让中间件开发者能将更多的精力放在产品功能特性实现上</span>");
            Resource ftlResource = new ClassPathResource("pdf/tpl.ftl");
            PdfUtils.generateToFile(ftlResource.getFile().getParentFile().getPath(), "tpl.ftl", ftlResource.getFile().getParentFile().getPath() + "", o, "D:\\xdemo.pdf");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
}
