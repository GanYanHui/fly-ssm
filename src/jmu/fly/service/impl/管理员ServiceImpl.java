package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.管理员Mapper;
import jmu.fly.po.管理员;
import jmu.fly.service.管理员Service;

@Service
@Transactional
public class 管理员ServiceImpl implements 管理员Service {

	@Resource(name = "管理员Mapper")
	private 管理员Mapper 管理员Mapper;
	
	@Override
	public 管理员 find管理员By登录id(String 登录id) {
		return this.管理员Mapper.find管理员By登录id(登录id);
	}

}
