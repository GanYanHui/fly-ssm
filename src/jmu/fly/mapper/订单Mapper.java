package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.����;

public interface ����Mapper {

	public ���� find����By������(String ������);
	
	public void insert����(���� ����);
	
	public List<����> findAll����();
	
	public void update����(@Param("������")String ������, @Param("����״̬")String ����״̬);
	
	public List<����> find����By�û�id(String �û�id);
}
