package com.botree.springdemo.mapper;

import com.botree.springdemo.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author fengsihang
 * @date 2018/7/13
 */
@Mapper
@Repository
public interface OrderMapper {

    /**
     * insert
     *
     * @param order
     */
    void insert(Order order);

    /**
     * userID
     *
     * @param id
     * @return
     */
    List<Order> findByUserId(Integer id);

    List<Order> findByMultiId(Map<String, Integer> map);

    List<Order> findByUserIdBetween(Map<String, Integer> map);

    /**
     * orderID
     *
     * @param id
     * @return
     */
    List<Order> findByOrderId(Integer id);

    Order selectOrderById(long id);
}
