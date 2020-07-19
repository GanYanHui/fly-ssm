package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.机场;
import jmu.fly.service.机场Service;
import jmu.fly.mapper.机场Mapper;

@Service
@Transactional
public class 机场ServiceImpl implements 机场Service {

	@Resource(name = "机场Mapper")
	private 机场Mapper 机场Mapper;
	
	@Override
	public List<机场> find机场By机场名称(String 机场名称) {
		return this.机场Mapper.find机场By机场名称(机场名称);
	}

}
