package jmu.fly.po;

public class 航线 {

	private String 航线编号;
	private String 出发城市;
	private String 到达城市;

	public String get航线编号() {
		return 航线编号;
	}

	public void set航线编号(String 航线编号) {
		this.航线编号 = 航线编号;
	}

	public String get出发城市() {
		return 出发城市;
	}

	public void set出发城市(String 出发城市) {
		this.出发城市 = 出发城市;
	}

	public String get到达城市() {
		return 到达城市;
	}

	public void set到达城市(String 到达城市) {
		this.到达城市 = 到达城市;
	}

	@Override
	public String toString() {
		return "航线 [航线编号=" + 航线编号 + ", 出发城市=" + 出发城市 + ", 到达城市=" + 到达城市 + "]";
	}

}
