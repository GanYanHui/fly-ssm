package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.订单Mapper;
import jmu.fly.po.订单;
import jmu.fly.service.订单Service;

@Service
@Transactional
public class 订单ServiceImpl implements 订单Service {

	@Resource(name = "订单Mapper")
	private 订单Mapper 订单Mapper;
	
	@Override
	public 订单 find订单By订单号(String 订单号) {
		return this.订单Mapper.find订单By订单号(订单号);
	}

	@Override
	public void insert订单(订单 订单) {
		this.订单Mapper.insert订单(订单);
	}
	
	@Override
	public List<订单> findAll订单(){
		return this.订单Mapper.findAll订单();
	}

	@Override
	public void update订单(String 订单号, String 订单状态) {
		this.订单Mapper.update订单(订单号, 订单状态);
	}

	@Override
	public List<订单> find订单By用户id(String 用户id) {
		return this.订单Mapper.find订单By用户id(用户id);
	}

}
