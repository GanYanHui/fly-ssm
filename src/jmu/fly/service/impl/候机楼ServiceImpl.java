package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.候机楼;
import jmu.fly.service.候机楼Service;
import jmu.fly.mapper.候机楼Mapper;

@Service
@Transactional
public class 候机楼ServiceImpl implements 候机楼Service {

	@Resource(name = "候机楼Mapper")
	private 候机楼Mapper 候机楼Mapper;
	
	@Override
	public 候机楼 find候机楼By候机楼编号(String 候机楼编号) {
		return this.候机楼Mapper.find候机楼By候机楼编号(候机楼编号);
	}

	@Override
	public List<候机楼> find候机楼By机场编号(String 机场编号) {
		return this.候机楼Mapper.find候机楼By机场编号(机场编号);
	}

	@Override
	public List<候机楼> findAll候机楼() {
		return 候机楼Mapper.findAll候机楼();
	}

}
