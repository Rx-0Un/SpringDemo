package com.example.demo.mapper;

import com.example.demo.entity.TbRule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbRuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insert(TbRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_rule
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insertSelective(TbRule record);
}