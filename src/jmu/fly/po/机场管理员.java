package jmu.fly.po;

public class 机场管理员 {
	private String 登录id;
	private String 登录密码;
	private String 联系电话;
	private String 邮箱;
	private String 机场管理员id;
	private String 权限;

	public String get登录id() {
		return 登录id;
	}

	public void set登录id(String 登录id) {
		this.登录id = 登录id;
	}

	public String get登录密码() {
		return 登录密码;
	}

	public void set登录密码(String 登录密码) {
		this.登录密码 = 登录密码;
	}

	public String get联系电话() {
		return 联系电话;
	}

	public void set联系电话(String 联系电话) {
		this.联系电话 = 联系电话;
	}

	public String get邮箱() {
		return 邮箱;
	}

	public void set邮箱(String 邮箱) {
		this.邮箱 = 邮箱;
	}

	public String get机场管理员id() {
		return 机场管理员id;
	}

	public void set机场管理员id(String 机场管理员id) {
		this.机场管理员id = 机场管理员id;
	}

	public String get权限() {
		return 权限;
	}

	public void set权限(String 权限) {
		this.权限 = 权限;
	}

	@Override
	public String toString() {
		return "机场管理员 [登录id=" + 登录id + ", 登录密码=" + 登录密码 + ", 联系电话=" + 联系电话 + ", 邮箱=" + 邮箱 + ", 机场管理员id=" + 机场管理员id
				+ ", 权限=" + 权限 + "]";
	}

}
