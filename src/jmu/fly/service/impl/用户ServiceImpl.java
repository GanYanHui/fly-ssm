package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.�û�Mapper;
import jmu.fly.po.�û�;
import jmu.fly.service.�û�Service;

@Service
@Transactional
public class �û�ServiceImpl implements �û�Service {

	@Resource(name = "�û�Mapper")
	private �û�Mapper �û�Mapper;

	@Override
	public �û� find�û�By�û�id(String �û�id) {
		return this.�û�Mapper.find�û�By�û�id(�û�id);
	}

	@Override
	public �û� find�û�By��¼id(String ��¼id) {
		return this.�û�Mapper.find�û�By��¼id(��¼id);
	}

	@Override
	public List<�û�> findAll�û�() {
		return this.�û�Mapper.findAll�û�();
	}

	@Override
	public void insert�û�(�û� �û�) {
		this.�û�Mapper.insert�û�(�û�);
	}

}
