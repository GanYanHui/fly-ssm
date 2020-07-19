package jmu.fly.po;

public class 机场 {
	private String 机场编号;
	private String 城市编号;
	private String 机场名称;
	private String 机场地址;
	private String 机场联系电话;

	public String get机场编号() {
		return 机场编号;
	}

	public void set机场编号(String 机场编号) {
		this.机场编号 = 机场编号;
	}

	public String get城市编号() {
		return 城市编号;
	}

	public void set城市编号(String 城市编号) {
		this.城市编号 = 城市编号;
	}

	public String get机场名称() {
		return 机场名称;
	}

	public void set机场名称(String 机场名称) {
		this.机场名称 = 机场名称;
	}

	public String get机场地址() {
		return 机场地址;
	}

	public void set机场地址(String 机场地址) {
		this.机场地址 = 机场地址;
	}

	public String get机场联系电话() {
		return 机场联系电话;
	}

	public void set机场联系电话(String 机场联系电话) {
		this.机场联系电话 = 机场联系电话;
	}

	@Override
	public String toString() {
		return "机场 [机场编号=" + 机场编号 + ", 城市编号=" + 城市编号 + ", 机场名称=" + 机场名称 + ", 机场地址=" + 机场地址 + ", 机场联系电话=" + 机场联系电话 + "]";
	}

}
