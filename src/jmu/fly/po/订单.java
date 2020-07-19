package jmu.fly.po;

public class 订单 {

	private String 订单号;
	private String 登录id;
	private String 用户id;
	private String 订单日期;
	private int 机票数;
	private String 联系电话;
	private int 抵用积分;
	private Double 总额;
	private String 订单状态;

	public String get订单号() {
		return 订单号;
	}

	public void set订单号(String 订单号) {
		this.订单号 = 订单号;
	}

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

	public String get订单日期() {
		return 订单日期;
	}

	public void set订单日期(String 订单日期) {
		this.订单日期 = 订单日期;
	}

	public int get机票数() {
		return 机票数;
	}

	public void set机票数(int 机票数) {
		this.机票数 = 机票数;
	}

	public String get联系电话() {
		return 联系电话;
	}

	public void set联系电话(String 联系电话) {
		this.联系电话 = 联系电话;
	}

	public int get抵用积分() {
		return 抵用积分;
	}

	public void set抵用积分(int 抵用积分) {
		this.抵用积分 = 抵用积分;
	}

	public Double get总额() {
		return 总额;
	}

	public void set总额(Double 总额) {
		this.总额 = 总额;
	}

	public String get订单状态() {
		return 订单状态;
	}

	public void set订单状态(String 订单状态) {
		this.订单状态 = 订单状态;
	}

	@Override
	public String toString() {
		return "订单 [订单号=" + 订单号 + ", 登录id=" + 登录id + ", 用户id=" + 用户id + ", 订单日期=" + 订单日期 + ", 机票数=" + 机票数 + ", 联系电话="
				+ 联系电话 + ", 抵用积分=" + 抵用积分 + ", 总额=" + 总额 + ", 订单状态=" + 订单状态 + "]";
	}

}
