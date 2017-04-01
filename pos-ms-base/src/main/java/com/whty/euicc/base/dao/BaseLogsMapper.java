package com.whty.euicc.base.dao;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.whty.euicc.base.dto.LogsUser;
import com.whty.euicc.base.pojo.BaseLogs;
import com.whty.euicc.base.pojo.BaseLogsExample;

public interface BaseLogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int countByExample(BaseLogsExample example);

    /**
     * This method was generated by MyBaOtis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int deleteByExample(BaseLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int insert(BaseLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int insertSelective(BaseLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    PageList<BaseLogs> selectByExample(BaseLogsExample example, PageBounds pageBounds);
    
    PageList<LogsUser> selectSystemLog(BaseLogsExample example, PageBounds pageBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    BaseLogs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int updateByExampleSelective(@Param("record") BaseLogs record, @Param("example") BaseLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int updateByExample(@Param("record") BaseLogs record, @Param("example") BaseLogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int updateByPrimaryKeySelective(BaseLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BASE_LOGS
     *
     * @mbggenerated Tue May 12 10:59:19 CST 2015
     */
    int updateByPrimaryKey(BaseLogs record);
}