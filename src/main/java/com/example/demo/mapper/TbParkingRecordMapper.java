package com.example.demo.mapper;

import com.example.demo.entity.TbParkingRecord;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbParkingRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_parking_record
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insert(TbParkingRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_parking_record
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    int insertSelective(TbParkingRecord record);
}