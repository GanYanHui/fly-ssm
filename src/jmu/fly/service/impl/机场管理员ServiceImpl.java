package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.机场管理员Mapper;
import jmu.fly.po.机场管理员;
import jmu.fly.service.机场管理员Service;

@Service
@Transactional
public class 机场管理员ServiceImpl implements 机场管理员Service {

	@Resource(name = "机场管理员Mapper")
	private 机场管理员Mapper 机场管理员Mapper;
	
	@Override
	public 机场管理员 find机场管理员By登录id(String 登录id) {
		return this.机场管理员Mapper.find机场管理员By登录id(登录id);
	}

}
