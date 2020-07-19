package jmu.fly.po;

public class 行李 {

	private String 行李编号;
	private String 机票编号;
	private Double 行李重量;
	private Double 长;
	private Double 宽;
	private Double 高;
	private Double 罚款;

	public String get行李编号() {
		return 行李编号;
	}

	public void set行李编号(String 行李编号) {
		this.行李编号 = 行李编号;
	}

	public String get机票编号() {
		return 机票编号;
	}

	public void set机票编号(String 机票编号) {
		this.机票编号 = 机票编号;
	}

	public Double get行李重量() {
		return 行李重量;
	}

	public void set行李重量(Double 行李重量) {
		this.行李重量 = 行李重量;
	}

	public Double get长() {
		return 长;
	}

	public void set长(Double 长) {
		this.长 = 长;
	}

	public Double get宽() {
		return 宽;
	}

	public void set宽(Double 宽) {
		this.宽 = 宽;
	}

	public Double get高() {
		return 高;
	}

	public void set高(Double 高) {
		this.高 = 高;
	}

	public Double get罚款() {
		return 罚款;
	}

	public void set罚款(Double 罚款) {
		this.罚款 = 罚款;
	}

	@Override
	public String toString() {
		return "行李 [行李编号=" + 行李编号 + ", 机票编号=" + 机票编号 + ", 行李重量=" + 行李重量 + ", 长=" + 长 + ", 宽=" + 宽 + ", 高=" + 高 + ", 罚款="
				+ 罚款 + "]";
	}

}
