package jmu.fly.po;

public class 绑定 {

	private String 登录id;
	private String 用户id;
	private String 乘机人身份证号;
	private String 绑定时间;

	public String get登录id() {
		return 登录id;
	}

	public void set登录id(String 登录id) {
		this.登录id = 登录id;
	}

	public String get用户id() {
		return 用户id;
	}

	public void set用户id(String 用户id) {
		this.用户id = 用户id;
	}

	public String get乘机人身份证号() {
		return 乘机人身份证号;
	}

	public void set乘机人身份证号(String 乘机人身份证号) {
		this.乘机人身份证号 = 乘机人身份证号;
	}

	public String get绑定时间() {
		return 绑定时间;
	}

	public void set绑定时间(String 绑定时间) {
		this.绑定时间 = 绑定时间;
	}

	@Override
	public String toString() {
		return "绑定 [登录id=" + 登录id + ", 用户id=" + 用户id + ", 乘机人身份证号=" + 乘机人身份证号 + ", 绑定时间=" + 绑定时间 + "]";
	}

}
