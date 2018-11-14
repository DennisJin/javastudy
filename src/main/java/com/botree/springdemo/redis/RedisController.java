package com.botree.springdemo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by ibm on 18-11-13.
 */
@RestController
public class RedisController {


    @Autowired
    RedisUtil redisUtil;
    /**
     *@Description: 测试redis
     */
    @RequestMapping(value ="/testRedisAdd",method = RequestMethod.GET)
    @ResponseBody
    public Object testAdd(){
        redisUtil.set("Test","122345");
        return redisUtil.get("Test");
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
