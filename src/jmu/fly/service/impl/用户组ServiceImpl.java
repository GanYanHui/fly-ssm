package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.�û���Mapper;
import jmu.fly.po.�û���;
import jmu.fly.service.�û���Service;

@Service
@Transactional
public class �û���ServiceImpl implements �û���Service {

	@Resource(name = "�û���Mapper")
	private �û���Mapper �û���Mapper;
	
	@Override
	public void insert�û���(�û��� �û���) {
		this.�û���Mapper.insert�û���(�û���);
	}

}
