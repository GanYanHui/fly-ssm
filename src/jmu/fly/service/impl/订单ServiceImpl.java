package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.����Mapper;
import jmu.fly.po.����;
import jmu.fly.service.����Service;

@Service
@Transactional
public class ����ServiceImpl implements ����Service {

	@Resource(name = "����Mapper")
	private ����Mapper ����Mapper;
	
	@Override
	public ���� find����By������(String ������) {
		return this.����Mapper.find����By������(������);
	}

	@Override
	public void insert����(���� ����) {
		this.����Mapper.insert����(����);
	}
	
	@Override
	public List<����> findAll����(){
		return this.����Mapper.findAll����();
	}

	@Override
	public void update����(String ������, String ����״̬) {
		this.����Mapper.update����(������, ����״̬);
	}

	@Override
	public List<����> find����By�û�id(String �û�id) {
		return this.����Mapper.find����By�û�id(�û�id);
	}

}
