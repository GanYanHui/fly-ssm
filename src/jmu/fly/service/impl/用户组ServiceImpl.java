package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.用户组Mapper;
import jmu.fly.po.用户组;
import jmu.fly.service.用户组Service;

@Service
@Transactional
public class 用户组ServiceImpl implements 用户组Service {

	@Resource(name = "用户组Mapper")
	private 用户组Mapper 用户组Mapper;
	
	@Override
	public void insert用户组(用户组 用户组) {
		this.用户组Mapper.insert用户组(用户组);
	}

}
