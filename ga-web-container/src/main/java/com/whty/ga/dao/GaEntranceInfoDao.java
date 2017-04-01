/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.whty.ga.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.whty.ga.entity.GaEntranceInfo;

/**
 * 出入信息DAO接口
 * @author liuwsh
 * @version 2017-02-28
 */
@MyBatisDao
public interface GaEntranceInfoDao extends CrudDao<GaEntranceInfo> {
	
}