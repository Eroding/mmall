package com.cnh.dao;

import com.cnh.pojo.MmallCart;

public interface MmallCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int insert(MmallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int insertSelective(MmallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    MmallCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int updateByPrimaryKeySelective(MmallCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_cart
     *
     * @mbggenerated Tue Sep 24 09:23:14 CST 2019
     */
    int updateByPrimaryKey(MmallCart record);
}