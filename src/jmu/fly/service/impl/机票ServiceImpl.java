package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.��Ʊ;
import jmu.fly.service.��ƱService;
import jmu.fly.mapper.��ƱMapper;

@Service
@Transactional
public class ��ƱServiceImpl implements ��ƱService {

	@Resource(name = "��ƱMapper")
	private ��ƱMapper ��ƱMapper;
	
	@Override
	public List<��Ʊ> findAll��Ʊ() {
		return this.��ƱMapper.findAll��Ʊ();
	}
	
	@Override
	public List<��Ʊ> find��ƱByִ�ɺ�����(String ִ�ɺ�����) {
		return this.��ƱMapper.find��ƱByִ�ɺ�����(ִ�ɺ�����);
	}

	@Override
	public void insert��Ʊ(��Ʊ ��Ʊ) {
		this.��ƱMapper.insert��Ʊ(��Ʊ);		
	}

	@Override
	public List<��Ʊ> find��ƱBy������(String ������) {
		return this.��ƱMapper.find��ƱBy������(������);
	}

}
