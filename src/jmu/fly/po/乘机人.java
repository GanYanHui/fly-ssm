package jmu.fly.po;

public class 乘机人 {

	private String 乘机人身份证号;
	private String 乘机人姓名;
	private String 乘机人性别;
	private String 乘机人联系电话;
	private String 信用状态;

	public String get乘机人身份证号() {
		return 乘机人身份证号;
	}

	public void set乘机人身份证号(String 乘机人身份证号) {
		this.乘机人身份证号 = 乘机人身份证号;
	}

	public String get乘机人姓名() {
		return 乘机人姓名;
	}

	public void set乘机人姓名(String 乘机人姓名) {
		this.乘机人姓名 = 乘机人姓名;
	}

	public String get乘机人性别() {
		return 乘机人性别;
	}

	public void set乘机人性别(String 乘机人性别) {
		this.乘机人性别 = 乘机人性别;
	}

	public String get乘机人联系电话() {
		return 乘机人联系电话;
	}

	public void set乘机人联系电话(String 乘机人联系电话) {
		this.乘机人联系电话 = 乘机人联系电话;
	}

	public String get信用状态() {
		return 信用状态;
	}

	public void set信用状态(String 信用状态) {
		this.信用状态 = 信用状态;
	}

	@Override
	public String toString() {
		return "乘机人 [乘机人身份证号=" + 乘机人身份证号 + ", 乘机人姓名=" + 乘机人姓名 + ", 乘机人性别=" + 乘机人性别 + ", 乘机人联系电话=" + 乘机人联系电话 + ", 信用状态="
				+ 信用状态 + "]";
	}

}
