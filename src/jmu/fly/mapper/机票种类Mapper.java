package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.��Ʊ����;

public interface ��Ʊ����Mapper {

	public List<��Ʊ����> find��Ʊ����Byִ�ɺ�����(String ִ�ɺ�����);
	
	public ��Ʊ���� find��Ʊ����Byִ�ɺ�����And��λ���(@Param("ִ�ɺ�����")String ִ�ɺ�����, @Param("��λ���")String ��λ���);
	
	public List<��Ʊ����> findAll��Ʊ����();
	
	public void update��Ʊ����(��Ʊ���� ��Ʊ����);
	
	public void insert��Ʊ����(��Ʊ���� ��Ʊ����);
	
	public void delete��Ʊ����Byִ�ɺ�����And��λ���(@Param("ִ�ɺ�����")String ִ�ɺ�����, @Param("��λ���")String ��λ���);
	
}
