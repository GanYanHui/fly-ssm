package jmu.fly.service;

import java.util.List;

import jmu.fly.po.��Ʊ����;

public interface ��Ʊ����Service {

	public List<��Ʊ����> find��Ʊ����Byִ�ɺ�����(String ִ�ɺ�����);
	
	public ��Ʊ���� find��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���);
	
	public List<��Ʊ����> findAll��Ʊ����();
	
	public void update��Ʊ����(��Ʊ���� ��Ʊ����);
	
	public void insert��Ʊ����(��Ʊ���� ��Ʊ����);
	
	public void delete��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���);
	
}
