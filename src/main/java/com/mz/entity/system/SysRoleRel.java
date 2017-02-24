package com.mz.entity.system;

import com.mz.entity.BaseBean;


/**
 * 
 * @ProjectName ：SpringMvcMz   
 * @ClassName：SysRoleRel   
 * @Description：   系统角色
 * @author：Ma Zhen   
 * @date：2016-04-22       
 * @version
 */
public class SysRoleRel extends BaseBean {
  
  private Integer id;
	
	
	/**
 	 * 枚举
 	 * @author lu
 	 *
 	 */
 	public static enum RelType {
		MENU(0, "菜单"), USER(1,"用户"),BTN(2,"按钮");
		public int key;
		public String value;
		private RelType(int key, String value) {
			this.key = key;
			this.value = value;
		}
		public static RelType get(int key) {
			RelType[] values = RelType.values();
			for (RelType object : values) {
				if (object.key == key) {
					return object;
				}
			}
			return null;
		}
	}
	
	
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
	
	
}