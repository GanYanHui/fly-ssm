package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.座位表Mapper;
import jmu.fly.po.座位表;
import jmu.fly.service.座位表Service;

@Service
@Transactional
public class 座位表ServiceImpl implements 座位表Service {

	@Resource(name = "座位表Mapper")
	private 座位表Mapper 座位表Mapper;
	
	@Override
	public List<座位表> findAll座位表() {
		return this.座位表Mapper.findAll座位表();
	}

}
