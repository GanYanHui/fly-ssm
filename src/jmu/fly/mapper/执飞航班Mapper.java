package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.ִ�ɺ���;

public interface ִ�ɺ���Mapper {
	
	public List<ִ�ɺ���> findִ�ɺ���By������(String ������);

	public List<ִ�ɺ���> findִ�ɺ���Byִ������(String ִ������);
	
	public ִ�ɺ��� findִ�ɺ���By������Andִ������(@Param("������")String ������, @Param("ִ������")String ִ������);
	
	public List<ִ�ɺ���> findAllִ�ɺ���();
	
	public ִ�ɺ��� findִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����);
	
	public void updateִ�ɺ���(ִ�ɺ��� ִ�ɺ���);
	
	public void insertִ�ɺ���(ִ�ɺ��� ִ�ɺ���);
	
	public void deleteִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����);
	
}
