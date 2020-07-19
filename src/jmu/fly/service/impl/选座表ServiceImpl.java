package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.选座表Mapper;
import jmu.fly.po.选座表;
import jmu.fly.service.选座表Service;

@Service
@Transactional
public class 选座表ServiceImpl implements 选座表Service{

	@Resource(name = "选座表Mapper")
	private 选座表Mapper 选座表Mapper;
	
	@Override
	public List<选座表> findAll选座表() {
		return this.选座表Mapper.findAll选座表();
	}

	@Override
	public void update选座表(选座表 选座表) {
		this.选座表Mapper.update选座表(选座表);
	}

}
