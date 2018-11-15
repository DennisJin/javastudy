package com.botree.springdemo.dao;

import com.botree.springdemo.model.Order;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by ibm on 18-11-15.
 */
@Component
public class OrderDao {
    private final SqlSession sqlSession;

    public OrderDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Order selectOrderById(long id) {
        return this.sqlSession.selectOne("selectOrderById", id);
    }
}
