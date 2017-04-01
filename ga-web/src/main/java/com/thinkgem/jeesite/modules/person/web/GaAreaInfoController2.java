/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.person.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.person.entity.GaAreaInfo2;
import com.thinkgem.jeesite.modules.person.service.GaAreaInfoService2;

/**
 * 小区信息Controller
 * @author liuwsh
 * @version 2017-02-17
 */
@Controller
@RequestMapping(value = "${adminPath}/person/gaAreaInfo2")
public class GaAreaInfoController2 extends BaseController {

	@Autowired
	private GaAreaInfoService2 areaInfoService;

	@RequiresPermissions("person:gaAreaInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(GaAreaInfo2 areaInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<GaAreaInfo2> page = areaInfoService.findPage(new Page<GaAreaInfo2>(request, response), areaInfo); 
		model.addAttribute("page", page);
		return "modules/person/gaAreaInfoList2";
	}

}