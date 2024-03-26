package chya.zhyy.func;

import chya.zhyy.entity.sys.SysFunc;

public class SysFuncModel extends SysFunc {

	private static final long serialVersionUID = 1L;
	private Integer groupId;
	private String groupName;
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	
}
