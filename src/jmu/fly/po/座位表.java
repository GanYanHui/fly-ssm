package jmu.fly.po;

public class 座位表 {

	private int 座位编号;
	private String 机型编号;
	private String 舱位编号;
	private String 位置;
	private boolean 安全座位;

	public int get座位编号() {
		return 座位编号;
	}

	public void set座位编号(int 座位编号) {
		this.座位编号 = 座位编号;
	}

	public String get机型编号() {
		return 机型编号;
	}

	public void set机型编号(String 机型编号) {
		this.机型编号 = 机型编号;
	}

	public String get舱位编号() {
		return 舱位编号;
	}

	public void set舱位编号(String 舱位编号) {
		this.舱位编号 = 舱位编号;
	}

	public String get位置() {
		return 位置;
	}

	public void set位置(String 位置) {
		this.位置 = 位置;
	}

	public boolean is安全座位() {
		return 安全座位;
	}

	public void set安全座位(boolean 安全座位) {
		this.安全座位 = 安全座位;
	}

	@Override
	public String toString() {
		return "座位表 [座位编号=" + 座位编号 + ", 机型编号=" + 机型编号 + ", 舱位编号=" + 舱位编号 + ", 位置=" + 位置 + ", 安全座位=" + 安全座位 + "]";
	}

}
