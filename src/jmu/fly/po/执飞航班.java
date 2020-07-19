package jmu.fly.po;

public class 执飞航班 {
	private String 执飞航班编号;
	private String 航班编号;
	private String 执飞日期;
	private double 执行价格;
	private String 预计起飞时间;
	private String 预计到达时间;
	private String 实际起飞时间;
	private String 实际到达时间;
	private String 状态;
	private String 登机口;
	private String 登机时间;

	public String get执飞航班编号() {
		return 执飞航班编号;
	}

	public void set执飞航班编号(String 执飞航班编号) {
		this.执飞航班编号 = 执飞航班编号;
	}

	public String get航班编号() {
		return 航班编号;
	}

	public void set航班编号(String 航班编号) {
		this.航班编号 = 航班编号;
	}

	public String get执飞日期() {
		return 执飞日期;
	}

	public void set执飞日期(String 执飞日期) {
		this.执飞日期 = 执飞日期;
	}

	public double get执行价格() {
		return 执行价格;
	}

	public void set执行价格(double 执行价格) {
		this.执行价格 = 执行价格;
	}

	public String get预计起飞时间() {
		return 预计起飞时间;
	}

	public void set预计起飞时间(String 预计起飞时间) {
		this.预计起飞时间 = 预计起飞时间;
	}

	public String get预计到达时间() {
		return 预计到达时间;
	}

	public void set预计到达时间(String 预计到达时间) {
		this.预计到达时间 = 预计到达时间;
	}

	public String get实际起飞时间() {
		return 实际起飞时间;
	}

	public void set实际起飞时间(String 实际起飞时间) {
		this.实际起飞时间 = 实际起飞时间;
	}

	public String get实际到达时间() {
		return 实际到达时间;
	}

	public void set实际到达时间(String 实际到达时间) {
		this.实际到达时间 = 实际到达时间;
	}

	public String get状态() {
		return 状态;
	}

	public void set状态(String 状态) {
		this.状态 = 状态;
	}

	public String get登机口() {
		return 登机口;
	}

	public void set登机口(String 登机口) {
		this.登机口 = 登机口;
	}

	public String get登机时间() {
		return 登机时间;
	}

	public void set登机时间(String 登机时间) {
		this.登机时间 = 登机时间;
	}

	@Override
	public String toString() {
		return "执飞航班 [执飞航班编号=" + 执飞航班编号 + ", 航班编号=" + 航班编号 + ", 执飞日期=" + 执飞日期 + ", 执行价格=" + 执行价格 + ", 预计起飞时间=" + 预计起飞时间
				+ ", 预计到达时间=" + 预计到达时间 + ", 实际起飞时间=" + 实际起飞时间 + ", 实际到达时间=" + 实际到达时间 + ", 状态=" + 状态 + ", 登机口=" + 登机口
				+ ", 登机时间=" + 登机时间 + "]";
	}

}
