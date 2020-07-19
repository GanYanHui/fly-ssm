package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.舱位Mapper;
import jmu.fly.po.舱位;
import jmu.fly.service.舱位Service;

@Service
@Transactional
public class 舱位ServiceImpl implements 舱位Service {

	@Resource(name = "舱位Mapper")
	private 舱位Mapper 舱位Mapper;
	
	@Override
	public List<舱位> findAll舱位() {
		return 舱位Mapper.findAll舱位();
	}

}
