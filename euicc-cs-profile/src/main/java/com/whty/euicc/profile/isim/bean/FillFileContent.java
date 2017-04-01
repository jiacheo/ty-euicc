package com.whty.euicc.profile.isim.bean;
import com.whty.euicc.profile.parent.JavaBean;
/**
 * Isim子元素
 * 结构类型：简单类型
 * @author Administrator
 *
 */
public class FillFileContent extends JavaBean{
	private String tag ="83";
	private String length;
	private String value;
	
	public FillFileContent() {
		
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "FillFileContent [length=" + length + ", tag=" + tag + ", value="
				+ value + "]";
	}
}
