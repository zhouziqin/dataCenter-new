package com.ucan.model;
/**
 * 套餐用户统计数据
 * @author zouweihua
 *
 */
public class UserCount {
	//季度
	private String name;
	//数量
	private Integer count;
	//区域
	private String town2;
	//城镇
	private String address;
	//状态
	private String isdeleted;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getTown2() {
		return town2;
	}
	public void setTown2(String town2) {
		this.town2 = town2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(String isdeleted) {
		this.isdeleted = isdeleted;
	}
	
}
