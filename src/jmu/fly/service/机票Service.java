package jmu.fly.service;

import java.util.List;

import jmu.fly.po.��Ʊ;

public interface ��ƱService {

	public List<��Ʊ> findAll��Ʊ();
	
	public List<��Ʊ> find��ƱByִ�ɺ�����(String ִ�ɺ�����);

	public void insert��Ʊ(��Ʊ ��Ʊ);
	
	public List<��Ʊ> find��ƱBy������(String ������);
}
