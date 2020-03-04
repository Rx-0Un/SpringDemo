package com.example.demo.test;

import com.example.demo.entity.TbUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest extends BaseMapperTest {
    @Test
    public void testUserSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            List<TbUser> Users = sqlSession.selectList("com.example.demo.mapper.TbUserMapper.selectAll");
            for (TbUser user : Users) {
                System.out.println(user.getUserName());
            }
        } finally {
            sqlSession.close();
        }
    }

}