package jmu.fly.po;

public class ��λ�� {

	private int ��λ���;
	private String ���ͱ��;
	private String ��λ���;
	private String λ��;
	private boolean ��ȫ��λ;

	public int get��λ���() {
		return ��λ���;
	}

	public void set��λ���(int ��λ���) {
		this.��λ��� = ��λ���;
	}

	public String get���ͱ��() {
		return ���ͱ��;
	}

	public void set���ͱ��(String ���ͱ��) {
		this.���ͱ�� = ���ͱ��;
	}

	public String get��λ���() {
		return ��λ���;
	}

	public void set��λ���(String ��λ���) {
		this.��λ��� = ��λ���;
	}

	public String getλ��() {
		return λ��;
	}

	public void setλ��(String λ��) {
		this.λ�� = λ��;
	}

	public boolean is��ȫ��λ() {
		return ��ȫ��λ;
	}

	public void set��ȫ��λ(boolean ��ȫ��λ) {
		this.��ȫ��λ = ��ȫ��λ;
	}

	@Override
	public String toString() {
		return "��λ�� [��λ���=" + ��λ��� + ", ���ͱ��=" + ���ͱ�� + ", ��λ���=" + ��λ��� + ", λ��=" + λ�� + ", ��ȫ��λ=" + ��ȫ��λ + "]";
	}

}
