package com.example.demo.entity;

import java.util.Date;

public class TbCoupon {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer couponId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_amount
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Float couponAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer couponUsageCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_location
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private String couponLocation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer couponCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_release_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Date couponReleaseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_start_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Date couponStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_end_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Date couponEndTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_coupon.coupon_situation
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer couponSituation;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public TbCoupon(Integer couponId, Float couponAmount, Integer couponUsageCount, String couponLocation, Integer couponCount, Date couponReleaseTime, Date couponStartTime, Date couponEndTime, Integer couponSituation) {
        this.couponId = couponId;
        this.couponAmount = couponAmount;
        this.couponUsageCount = couponUsageCount;
        this.couponLocation = couponLocation;
        this.couponCount = couponCount;
        this.couponReleaseTime = couponReleaseTime;
        this.couponStartTime = couponStartTime;
        this.couponEndTime = couponEndTime;
        this.couponSituation = couponSituation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_coupon
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public TbCoupon() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_id
     *
     * @return the value of tb_coupon.coupon_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_id
     *
     * @param couponId the value for tb_coupon.coupon_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_amount
     *
     * @return the value of tb_coupon.coupon_amount
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Float getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_amount
     *
     * @param couponAmount the value for tb_coupon.coupon_amount
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponAmount(Float couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_usage_count
     *
     * @return the value of tb_coupon.coupon_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getCouponUsageCount() {
        return couponUsageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_usage_count
     *
     * @param couponUsageCount the value for tb_coupon.coupon_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponUsageCount(Integer couponUsageCount) {
        this.couponUsageCount = couponUsageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_location
     *
     * @return the value of tb_coupon.coupon_location
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public String getCouponLocation() {
        return couponLocation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_location
     *
     * @param couponLocation the value for tb_coupon.coupon_location
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponLocation(String couponLocation) {
        this.couponLocation = couponLocation == null ? null : couponLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_count
     *
     * @return the value of tb_coupon.coupon_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getCouponCount() {
        return couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_count
     *
     * @param couponCount the value for tb_coupon.coupon_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponCount(Integer couponCount) {
        this.couponCount = couponCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_release_time
     *
     * @return the value of tb_coupon.coupon_release_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Date getCouponReleaseTime() {
        return couponReleaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_release_time
     *
     * @param couponReleaseTime the value for tb_coupon.coupon_release_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponReleaseTime(Date couponReleaseTime) {
        this.couponReleaseTime = couponReleaseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_start_time
     *
     * @return the value of tb_coupon.coupon_start_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Date getCouponStartTime() {
        return couponStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_start_time
     *
     * @param couponStartTime the value for tb_coupon.coupon_start_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_end_time
     *
     * @return the value of tb_coupon.coupon_end_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Date getCouponEndTime() {
        return couponEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_end_time
     *
     * @param couponEndTime the value for tb_coupon.coupon_end_time
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponEndTime(Date couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_coupon.coupon_situation
     *
     * @return the value of tb_coupon.coupon_situation
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getCouponSituation() {
        return couponSituation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_coupon.coupon_situation
     *
     * @param couponSituation the value for tb_coupon.coupon_situation
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setCouponSituation(Integer couponSituation) {
        this.couponSituation = couponSituation;
    }
}