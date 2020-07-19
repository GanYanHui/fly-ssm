package jmu.fly.po;

public class 机型 {

	public String 机型编号;
	public String 机型名称;

	public String get机型编号() {
		return 机型编号;
	}

	public void set机型编号(String 机型编号) {
		this.机型编号 = 机型编号;
	}

	public String get机型名称() {
		return 机型名称;
	}

	public void set机型名称(String 机型名称) {
		this.机型名称 = 机型名称;
	}

	@Override
	public String toString() {
		return "机型 [机型编号=" + 机型编号 + ", 机型名称=" + 机型名称 + "]";
	}

}
