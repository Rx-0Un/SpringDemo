package com.example.demo.mapper;

import com.example.demo.entity.TbUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insert(TbUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insertSelective(TbUser record);

    TbUser[] selectAll();

    int selectForLogin(@Param("user_name") String name, @Param("user_pwd") String pwd);
}