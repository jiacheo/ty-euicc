package com.whty.euicc.base.dao;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.euicc.base.pojo.BaseUsers;
import com.whty.euicc.base.pojo.BaseUsersExample;

public interface BaseUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int countByExample(BaseUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int deleteByExample(BaseUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int insert(BaseUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int insertSelective(BaseUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    PageList<BaseUsers> selectByExample(BaseUsersExample example, PageBounds pageBounds);
    
    
    PageList<BaseUsers> selectByExample(BaseUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    BaseUsers selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int updateByExampleSelective(@Param("record") BaseUsers record, @Param("example") BaseUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int updateByExample(@Param("record") BaseUsers record, @Param("example") BaseUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int updateByPrimaryKeySelective(BaseUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_USERS
     *
     * @mbggenerated Fri Apr 10 11:28:31 CST 2015
     */
    int updateByPrimaryKey(BaseUsers record);
    
    int upateUserStatus(BaseUsers record);
}