package jmu.fly.po;

public class 航班 {
	private String 航班编号;
	private String 航线编号;
	private String 机型编号;
	private String 出发地候机楼编号;
	private String 目的地候机楼编号;
	private String 计划起飞时间;
	private String 计划到达时间;

	public String get航班编号() {
		return 航班编号;
	}

	public void set航班编号(String 航班编号) {
		this.航班编号 = 航班编号;
	}

	public String get航线编号() {
		return 航线编号;
	}

	public void set航线编号(String 航线编号) {
		this.航线编号 = 航线编号;
	}

	public String get机型编号() {
		return 机型编号;
	}

	public void set机型编号(String 机型编号) {
		this.机型编号 = 机型编号;
	}

	public String get出发地候机楼编号() {
		return 出发地候机楼编号;
	}

	public void set出发地候机楼编号(String 出发地候机楼编号) {
		this.出发地候机楼编号 = 出发地候机楼编号;
	}

	public String get目的地候机楼编号() {
		return 目的地候机楼编号;
	}

	public void set目的地候机楼编号(String 目的地候机楼编号) {
		this.目的地候机楼编号 = 目的地候机楼编号;
	}

	public String get计划起飞时间() {
		return 计划起飞时间;
	}

	public void set计划起飞时间(String 计划起飞时间) {
		this.计划起飞时间 = 计划起飞时间;
	}

	public String get计划到达时间() {
		return 计划到达时间;
	}

	public void set计划到达时间(String 计划到达时间) {
		this.计划到达时间 = 计划到达时间;
	}

	@Override
	public String toString() {
		return "航班 [航班编号=" + 航班编号 + ", 航线编号=" + 航线编号 + ", 机型编号=" + 机型编号 + ", 出发地候机楼编号=" + 出发地候机楼编号 + ", 目的地候机楼编号="
				+ 目的地候机楼编号 + ", 计划起飞时间=" + 计划起飞时间 + ", 计划到达时间=" + 计划到达时间 + "]";
	}

}
