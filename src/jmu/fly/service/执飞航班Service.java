package jmu.fly.service;

import java.util.List;

import jmu.fly.po.ִ�ɺ���;

public interface ִ�ɺ���Service {
	
	public List<ִ�ɺ���> findִ�ɺ���By������(String ������);

	public List<ִ�ɺ���> findִ�ɺ���Byִ������(String ִ������);

	public ִ�ɺ��� findִ�ɺ���By������Andִ������(String ������, String ִ������);
	
	public List<ִ�ɺ���> findAllִ�ɺ���();
	
	public ִ�ɺ��� findִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����);
	
	public void updateִ�ɺ���(ִ�ɺ��� ִ�ɺ���);
	
	public void insertִ�ɺ���(ִ�ɺ��� ִ�ɺ���);
	
	public void deleteִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����);
	
}
