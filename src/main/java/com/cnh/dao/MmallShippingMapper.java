package com.cnh.dao;

import com.cnh.pojo.MmallShipping;

public interface MmallShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int insert(MmallShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int insertSelective(MmallShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    MmallShipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int updateByPrimaryKeySelective(MmallShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_shipping
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int updateByPrimaryKey(MmallShipping record);
}