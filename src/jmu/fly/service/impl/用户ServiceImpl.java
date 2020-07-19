package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.用户Mapper;
import jmu.fly.po.用户;
import jmu.fly.service.用户Service;

@Service
@Transactional
public class 用户ServiceImpl implements 用户Service {

	@Resource(name = "用户Mapper")
	private 用户Mapper 用户Mapper;

	@Override
	public 用户 find用户By用户id(String 用户id) {
		return this.用户Mapper.find用户By用户id(用户id);
	}

	@Override
	public 用户 find用户By登录id(String 登录id) {
		return this.用户Mapper.find用户By登录id(登录id);
	}

	@Override
	public List<用户> findAll用户() {
		return this.用户Mapper.findAll用户();
	}

	@Override
	public void insert用户(用户 用户) {
		this.用户Mapper.insert用户(用户);
	}

}
