package com.example.demo.test;

import com.example.demo.mapper.TbStaffMapper;
import com.example.demo.mapper.TbUserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class StaffMapperTest extends BaseMapperTest {
    @Test
    public void testSelectForLogin(){
        String name = "tony";
        String pwd = "123456";
        int count = 0;
        SqlSession sqlSession = getSqlSession();
        try {
            TbStaffMapper tbStaffMapper = sqlSession.getMapper(TbStaffMapper.class);
            count = tbStaffMapper.selectForLogin(name,pwd);
            if (count==0){
                System.out.println(name+"不存在");
            }
            else {
                System.out.println("success");
            }
        } finally {
            sqlSession.close();
        }
    }
    @Test
    public void selectByUserName(){
        String name = "tony";
        int count = 0;
        SqlSession sqlSession = getSqlSession();
        try {
            TbStaffMapper tbStaffMapper = sqlSession.getMapper(TbStaffMapper.class);
            count = tbStaffMapper.selectByUserName(name);
            if (count==0){
                System.out.println(name+"不存在");
            }
            else {
                System.out.println("存在");
            }
        } finally {
            sqlSession.close();
        }
    }
}
