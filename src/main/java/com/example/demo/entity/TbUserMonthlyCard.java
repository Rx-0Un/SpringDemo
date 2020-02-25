package com.example.demo.entity;

public class TbUserMonthlyCard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_monthly_card.user_monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer userMonthlyCardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_monthly_card.user_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_monthly_card.monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer monthlyCardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_monthly_card.user_monthly_card_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer userMonthlyCardUsageCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user_monthly_card.order_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    private Integer orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_monthly_card
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public TbUserMonthlyCard(Integer userMonthlyCardId, Integer userId, Integer monthlyCardId, Integer userMonthlyCardUsageCount, Integer orderId) {
        this.userMonthlyCardId = userMonthlyCardId;
        this.userId = userId;
        this.monthlyCardId = monthlyCardId;
        this.userMonthlyCardUsageCount = userMonthlyCardUsageCount;
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_user_monthly_card
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public TbUserMonthlyCard() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_monthly_card.user_monthly_card_id
     *
     * @return the value of tb_user_monthly_card.user_monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getUserMonthlyCardId() {
        return userMonthlyCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_monthly_card.user_monthly_card_id
     *
     * @param userMonthlyCardId the value for tb_user_monthly_card.user_monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setUserMonthlyCardId(Integer userMonthlyCardId) {
        this.userMonthlyCardId = userMonthlyCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_monthly_card.user_id
     *
     * @return the value of tb_user_monthly_card.user_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_monthly_card.user_id
     *
     * @param userId the value for tb_user_monthly_card.user_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_monthly_card.monthly_card_id
     *
     * @return the value of tb_user_monthly_card.monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getMonthlyCardId() {
        return monthlyCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_monthly_card.monthly_card_id
     *
     * @param monthlyCardId the value for tb_user_monthly_card.monthly_card_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setMonthlyCardId(Integer monthlyCardId) {
        this.monthlyCardId = monthlyCardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_monthly_card.user_monthly_card_usage_count
     *
     * @return the value of tb_user_monthly_card.user_monthly_card_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getUserMonthlyCardUsageCount() {
        return userMonthlyCardUsageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_monthly_card.user_monthly_card_usage_count
     *
     * @param userMonthlyCardUsageCount the value for tb_user_monthly_card.user_monthly_card_usage_count
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setUserMonthlyCardUsageCount(Integer userMonthlyCardUsageCount) {
        this.userMonthlyCardUsageCount = userMonthlyCardUsageCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user_monthly_card.order_id
     *
     * @return the value of tb_user_monthly_card.order_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user_monthly_card.order_id
     *
     * @param orderId the value for tb_user_monthly_card.order_id
     *
     * @mbg.generated Tue Feb 25 17:41:08 GMT+08:00 2020
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}