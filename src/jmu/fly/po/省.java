package jmu.fly.po;

public class 省 {
	private String 省编号;
	private String 省名;
	private String 省会;

	public String get省编号() {
		return 省编号;
	}

	public void set省编号(String 省编号) {
		this.省编号 = 省编号;
	}

	public String get省名() {
		return 省名;
	}

	public void set省名(String 省名) {
		this.省名 = 省名;
	}

	public String get省会() {
		return 省会;
	}

	public void set省会(String 省会) {
		this.省会 = 省会;
	}

	@Override
	public String toString() {
		return "省 [省编号=" + 省编号 + ", 省名=" + 省名 + ", 省会=" + 省会 + "]";
	}

}
