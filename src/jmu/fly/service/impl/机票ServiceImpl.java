package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.机票;
import jmu.fly.service.机票Service;
import jmu.fly.mapper.机票Mapper;

@Service
@Transactional
public class 机票ServiceImpl implements 机票Service {

	@Resource(name = "机票Mapper")
	private 机票Mapper 机票Mapper;
	
	@Override
	public List<机票> findAll机票() {
		return this.机票Mapper.findAll机票();
	}
	
	@Override
	public List<机票> find机票By执飞航班编号(String 执飞航班编号) {
		return this.机票Mapper.find机票By执飞航班编号(执飞航班编号);
	}

	@Override
	public void insert机票(机票 机票) {
		this.机票Mapper.insert机票(机票);		
	}

	@Override
	public List<机票> find机票By订单号(String 订单号) {
		return this.机票Mapper.find机票By订单号(订单号);
	}

}
