package jmu.fly.po;

public class 城市 {
	private String 城市编号;
	private String 省编号;
	private String 城市名;
	private String 邮编;

	public String get城市编号() {
		return 城市编号;
	}

	public void set城市编号(String 城市编号) {
		this.城市编号 = 城市编号;
	}

	public String get省编号() {
		return 省编号;
	}

	public void set省编号(String 省编号) {
		this.省编号 = 省编号;
	}

	public String get城市名() {
		return 城市名;
	}

	public void set城市名(String 城市名) {
		this.城市名 = 城市名;
	}

	public String get邮编() {
		return 邮编;
	}

	public void set邮编(String 邮编) {
		this.邮编 = 邮编;
	}

	@Override
	public String toString() {
		return "城市 [城市编号=" + 城市编号 + ", 省编号=" + 省编号 + ", 城市名=" + 城市名 + ", 邮编=" + 邮编 + "]";
	}

}
