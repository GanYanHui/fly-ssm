package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.����;

public interface ����Mapper {

	public ���� find����By����(@Param("��������")String ��������, @Param("�������")String �������);
	
	public List<����> findAll����();
}
