package jmu.fly.po;

public class 候机楼 {
	private String 候机楼编号;
	private String 机场编号;
	private String 候机楼名称;

	public String get候机楼编号() {
		return 候机楼编号;
	}

	public void set候机楼编号(String 候机楼编号) {
		this.候机楼编号 = 候机楼编号;
	}

	public String get机场编号() {
		return 机场编号;
	}

	public void set机场编号(String 机场编号) {
		this.机场编号 = 机场编号;
	}

	public String get候机楼名称() {
		return 候机楼名称;
	}

	public void set候机楼名称(String 候机楼名称) {
		this.候机楼名称 = 候机楼名称;
	}

	@Override
	public String toString() {
		return "候机楼 [候机楼编号=" + 候机楼编号 + ", 机场编号=" + 机场编号 + ", 候机楼名称=" + 候机楼名称 + "]";
	}

}
