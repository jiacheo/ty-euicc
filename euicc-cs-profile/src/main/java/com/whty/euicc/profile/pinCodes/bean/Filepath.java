package com.whty.euicc.profile.pinCodes.bean;
import com.whty.euicc.profile.parent.JavaBean;
/**
 * PinCodes子元素
 * 结构类型：简单类型
 * @author Administrator
 *
 */
public class Filepath extends JavaBean{
	private String tag ="81";

	
	public Filepath() {
		
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}



	@Override
	public String toString() {
		return "Filepath [length=" + length + ", tag=" + tag + ", value="
				+ value + "]";
	}
	
	
	
}
