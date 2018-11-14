package com.botree.springdemo.shardingjdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by ibm on 18-11-14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMapperTest {
    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void contextLoads() {

    }

    /**
     * 单片ID切分添加
     */
    @Test
    public void add() {
        Order order = new Order();
        for (int i =1; i <=20; i++) {
            for (int j = 1; j <= 30; j++) {
                order.setUserId(i);
                order.setOrderId(j);
                orderMapper.insert(order);
            }
        }
    }

    /**
     * 单片查询
     */
    @Test
    public void getByUserId(){
        List<Order> byUserId = orderMapper.findByUserId(20);
        for (Order order : byUserId) {
            System.out.println(order);
        }

    }

}
