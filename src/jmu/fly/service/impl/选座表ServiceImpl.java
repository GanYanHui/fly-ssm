package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.ѡ����Mapper;
import jmu.fly.po.ѡ����;
import jmu.fly.service.ѡ����Service;

@Service
@Transactional
public class ѡ����ServiceImpl implements ѡ����Service{

	@Resource(name = "ѡ����Mapper")
	private ѡ����Mapper ѡ����Mapper;
	
	@Override
	public List<ѡ����> findAllѡ����() {
		return this.ѡ����Mapper.findAllѡ����();
	}

	@Override
	public void updateѡ����(ѡ���� ѡ����) {
		this.ѡ����Mapper.updateѡ����(ѡ����);
	}

}
