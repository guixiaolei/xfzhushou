package cn.kingcai.entity;

/**
 * 返回的信访局成员列表
 * @author volcano
 *
 */
public class Letterbureau {
	private String username;
	private String tel;
	private Character onduty;
	private Character isprincipal;
	private Character isgetprovince;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Character getOnduty() {
		return onduty;
	}

	public void setOnduty(Character onduty) {
		this.onduty = onduty;
	}

	public Character getIsprincipal() {
		return isprincipal;
	}

	public void setIsprincipal(Character isprincipal) {
		this.isprincipal = isprincipal;
	}

	public Character getIsgetprovince() {
		return isgetprovince;
	}

	public void setIsgetprovince(Character isgetprovince) {
		this.isgetprovince = isgetprovince;
	}
	
}
