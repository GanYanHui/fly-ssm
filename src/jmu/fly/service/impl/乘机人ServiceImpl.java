package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.�˻���Mapper;
import jmu.fly.po.�˻���;
import jmu.fly.service.�˻���Service;

@Service
@Transactional
public class �˻���ServiceImpl implements �˻���Service {

	@Resource(name = "�˻���Mapper")
	private �˻���Mapper �˻���Mapper;
	
	@Override
	public �˻��� find�˻���By�˻������֤��(String �˻������֤��) {
		return this.�˻���Mapper.find�˻���By�˻������֤��(�˻������֤��);
	}

	@Override
	public void insert�˻���(�˻��� �˻���) {
		this.�˻���Mapper.insert�˻���(�˻���);
	}

}
