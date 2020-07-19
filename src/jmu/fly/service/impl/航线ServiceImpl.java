package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.航线;
import jmu.fly.service.航线Service;
import jmu.fly.mapper.航线Mapper;

@Service
@Transactional
public class 航线ServiceImpl implements 航线Service {

	@Resource(name = "航线Mapper")
	private 航线Mapper 航线Mapper;
	
	@Override
	public 航线 find航线By城市(String 出发城市, String 到达城市) {
		return this.航线Mapper.find航线By城市(出发城市, 到达城市);
	}

	@Override
	public List<航线> findAll航线() {
		return this.航线Mapper.findAll航线();
	}

}
