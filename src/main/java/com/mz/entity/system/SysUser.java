package com.mz.entity.system;

import com.mz.entity.BaseBean;



/**
 * 
 * @ProjectName ：SpringMvcMz   
 * @ClassName：SysUser   
 * @Description：   系统用户
 * @author：Ma Zhen   
 * @date：2016-04-22       
 * @version
 */
public class SysUser extends BaseBean {
	
	
	private String npwd;
	
	private Integer superAdmin;//超级管理员
	
	private String roleStr;//用户权限, 按","区分
	
	
	
		return roleStr;
	}
	public void setRoleStr(String roleStr) {
		this.roleStr = roleStr;
	}
	public Integer getId() {
	public Integer getSuperAdmin() {
		return superAdmin;
	}
	public void setSuperAdmin(Integer superAdmin) {
		this.superAdmin = superAdmin;
	}
  public String getNpwd() {
    return npwd;
  }
  public void setNpwd(String npwd) {
    this.npwd = npwd;
  }
	
}