package jmu.fly.po;

public class 用户 {
	private String 登录id;
	private String 用户id;
	private String 登录密码;
	private String 联系电话;
	private String 邮箱;
	private String 用户姓名;
	private String 用户身份证号;
	private String 用户性别;
	private int 用户年龄;
	private int 用户积分;

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

	public String get用户姓名() {
		return 用户姓名;
	}

	public void set用户姓名(String 用户姓名) {
		this.用户姓名 = 用户姓名;
	}

	public String get用户身份证号() {
		return 用户身份证号;
	}

	public void set用户身份证号(String 用户身份证号) {
		this.用户身份证号 = 用户身份证号;
	}

	public String get用户性别() {
		return 用户性别;
	}

	public void set用户性别(String 用户性别) {
		this.用户性别 = 用户性别;
	}

	public int get用户年龄() {
		return 用户年龄;
	}

	public void set用户年龄(int 用户年龄) {
		this.用户年龄 = 用户年龄;
	}

	public int get用户积分() {
		return 用户积分;
	}

	public void set用户积分(int 用户积分) {
		this.用户积分 = 用户积分;
	}

	@Override
	public String toString() {
		return "用户 [登录id=" + 登录id + ", 用户id=" + 用户id + ", 登录密码=" + 登录密码 + ", 联系电话=" + 联系电话 + ", 邮箱=" + 邮箱 + ", 用户姓名="
				+ 用户姓名 + ", 用户身份证号=" + 用户身份证号 + ", 用户性别=" + 用户性别 + ", 用户年龄=" + 用户年龄 + ", 用户积分=" + 用户积分 + "]";
	}

}
