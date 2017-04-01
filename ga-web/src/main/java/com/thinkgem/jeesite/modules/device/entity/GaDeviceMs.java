/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.device.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 终端设备Entity
 * @author liuwsh
 * @version 2017-02-28
 */
public class GaDeviceMs extends DataEntity<GaDeviceMs> {
	
	private static final long serialVersionUID = 1L;
	private String moteId;		// 中继id
	private String moteNo;
	private String apId;		// ap_id
	private String apNo;
	private String deviceId;		// 设备号
	private String longitude;		// 经度
	private String latitude;		// 纬度
	private String address;		// 地址
	private String status;		// 状态
	
	public GaDeviceMs() {
		super();
	}

	public GaDeviceMs(String id){
		super(id);
	}

	@Length(min=0, max=32, message="中继id长度必须介于 0 和 32 之间")
	public String getMoteId() {
		return moteId;
	}

	public void setMoteId(String moteId) {
		this.moteId = moteId;
	}
	
	@Length(min=0, max=32, message="ap_id长度必须介于 0 和 32 之间")
	public String getApId() {
		return apId;
	}

	public void setApId(String apId) {
		this.apId = apId;
	}
	
	@Length(min=1, max=64, message="设备号长度必须介于 1 和 64 之间")
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	@Length(min=0, max=64, message="经度长度必须介于 0 和 64 之间")
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	@Length(min=0, max=64, message="纬度长度必须介于 0 和 64 之间")
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	@Length(min=0, max=64, message="地址长度必须介于 0 和 64 之间")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Length(min=1, max=1, message="状态长度必须介于 1 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the moteNo
	 */
	public String getMoteNo() {
		return moteNo;
	}

	/**
	 * @param moteNo the moteNo to set
	 */
	public void setMoteNo(String moteNo) {
		this.moteNo = moteNo;
	}

	/**
	 * @return the apNo
	 */
	public String getApNo() {
		return apNo;
	}

	/**
	 * @param apNo the apNo to set
	 */
	public void setApNo(String apNo) {
		this.apNo = apNo;
	}
	
	
	
}