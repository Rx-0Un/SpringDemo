package com.example.demo.service;

import com.example.demo.mapper.TbStaffMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService extends BaseService {

    @Autowired
    private TbStaffMapper tbStaffMapper;

    /**
     * 判断用户名密码是否匹配
     * @param name
     * @param pwd
     * @return
     */
    public int SelectForLogin(String name,String pwd){
        SqlSession sqlSession = getSqlSession();
        try {
            tbStaffMapper = sqlSession.getMapper(TbStaffMapper.class);
            return tbStaffMapper.selectForLogin(name,pwd);
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 判断用户是否存在
     * @param name
     * @return
     */
    public int SelectByStaffName(String name){
        SqlSession sqlSession = getSqlSession();
        try {
            tbStaffMapper = sqlSession.getMapper(TbStaffMapper.class);
            return tbStaffMapper.selectByUserName(name);
        } finally {
            sqlSession.close();
        }
    }
}
