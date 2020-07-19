package jmu.fly.po;

public class 机票 {
	private String 机票编号;
	private String 乘机人身份证号;
	private String 订单号;
	private String 舱位编号;
	private String 执飞航班编号;
	private int 座位编号;
	private double 机场建设费;
	private double 保险费;
	private double 机票价格;
	private String 备注;
	private String 值机状态;
	private String 登机号;

	public String get机票编号() {
		return 机票编号;
	}

	public void set机票编号(String 机票编号) {
		this.机票编号 = 机票编号;
	}

	public String get乘机人身份证号() {
		return 乘机人身份证号;
	}

	public void set乘机人身份证号(String 乘机人身份证号) {
		this.乘机人身份证号 = 乘机人身份证号;
	}

	public String get订单号() {
		return 订单号;
	}

	public void set订单号(String 订单号) {
		this.订单号 = 订单号;
	}

	public String get舱位编号() {
		return 舱位编号;
	}

	public void set舱位编号(String 舱位编号) {
		this.舱位编号 = 舱位编号;
	}

	public String get执飞航班编号() {
		return 执飞航班编号;
	}

	public void set执飞航班编号(String 执飞航班编号) {
		this.执飞航班编号 = 执飞航班编号;
	}

	public int get座位编号() {
		return 座位编号;
	}

	public void set座位编号(int 座位编号) {
		this.座位编号 = 座位编号;
	}

	public double get机场建设费() {
		return 机场建设费;
	}

	public void set机场建设费(double 机场建设费) {
		this.机场建设费 = 机场建设费;
	}

	public double get保险费() {
		return 保险费;
	}

	public void set保险费(double 保险费) {
		this.保险费 = 保险费;
	}

	public double get机票价格() {
		return 机票价格;
	}

	public void set机票价格(double 机票价格) {
		this.机票价格 = 机票价格;
	}

	public String get备注() {
		return 备注;
	}

	public void set备注(String 备注) {
		this.备注 = 备注;
	}

	public String get值机状态() {
		return 值机状态;
	}

	public void set值机状态(String 值机状态) {
		this.值机状态 = 值机状态;
	}

	public String get登机号() {
		return 登机号;
	}

	public void set登机号(String 登机号) {
		this.登机号 = 登机号;
	}

	@Override
	public String toString() {
		return "机票 [机票编号=" + 机票编号 + ", 乘机人身份证号=" + 乘机人身份证号 + ", 订单号=" + 订单号 + ", 舱位编号=" + 舱位编号 + ", 执飞航班编号=" + 执飞航班编号
				+ ", 座位编号=" + 座位编号 + ", 机场建设费=" + 机场建设费 + ", 保险费=" + 保险费 + ", 机票价格=" + 机票价格 + ", 备注=" + 备注 + ", 值机状态="
				+ 值机状态 + ", 登机号=" + 登机号 + "]";
	}

}
