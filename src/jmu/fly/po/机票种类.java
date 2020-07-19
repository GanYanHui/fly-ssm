package jmu.fly.po;

public class 机票种类 {

	private String 舱位编号;
	private String 执飞航班编号;
	private Double 销售价格;
	private String 有效起始日期;
	private String 有效截至日期;
	private Double 折扣;
	private int 余票量;
	private int 行李额度;
	private int 行李件数;
	private String 餐食状态;
	private String 退改签规则;

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

	public Double get销售价格() {
		return 销售价格;
	}

	public void set销售价格(Double 销售价格) {
		this.销售价格 = 销售价格;
	}

	public String get有效起始日期() {
		return 有效起始日期;
	}

	public void set有效起始日期(String 有效起始日期) {
		this.有效起始日期 = 有效起始日期;
	}

	public String get有效截至日期() {
		return 有效截至日期;
	}

	public void set有效截至日期(String 有效截至日期) {
		this.有效截至日期 = 有效截至日期;
	}

	public Double get折扣() {
		return 折扣;
	}

	public void set折扣(Double 折扣) {
		this.折扣 = 折扣;
	}

	public int get余票量() {
		return 余票量;
	}

	public void set余票量(int 余票量) {
		this.余票量 = 余票量;
	}

	public int get行李额度() {
		return 行李额度;
	}

	public void set行李额度(int 行李额度) {
		this.行李额度 = 行李额度;
	}

	public int get行李件数() {
		return 行李件数;
	}

	public void set行李件数(int 行李件数) {
		this.行李件数 = 行李件数;
	}

	public String get餐食状态() {
		return 餐食状态;
	}

	public void set餐食状态(String 餐食状态) {
		this.餐食状态 = 餐食状态;
	}

	public String get退改签规则() {
		return 退改签规则;
	}

	public void set退改签规则(String 退改签规则) {
		this.退改签规则 = 退改签规则;
	}

	@Override
	public String toString() {
		return "机票种类 [舱位编号=" + 舱位编号 + ", 执飞航班编号=" + 执飞航班编号 + ", 销售价格=" + 销售价格 + ", 有效起始日期=" + 有效起始日期 + ", 有效截至日期="
				+ 有效截至日期 + ", 折扣=" + 折扣 + ", 余票量=" + 余票量 + ", 行李额度=" + 行李额度 + ", 行李件数=" + 行李件数 + ", 餐食状态=" + 餐食状态
				+ ", 退改签规则=" + 退改签规则 + "]";
	}

}
