package jmu.fly.service;

import java.util.List;

import jmu.fly.po.����;

public interface ����Service {
	
	public List<����> find����By���¥���(String ���¥���);
	
	public List<����> find����By���߱��(String ���߱��);
	
	public void insert����(���� ����);
	
	public void delete����By������(String ������);
	
	public List<����> findAll����();
	
	public ���� find����By������(String ������);
	
	public void update����(���� ����);
	
	public List<����> find����ByLike(String string);
	
}
