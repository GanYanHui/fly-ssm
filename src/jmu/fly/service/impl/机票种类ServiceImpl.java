package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.机票种类Mapper;
import jmu.fly.po.机票种类;
import jmu.fly.service.机票种类Service;

@Service
@Transactional
public class 机票种类ServiceImpl implements 机票种类Service {

	@Resource(name = "机票种类Mapper")
	private 机票种类Mapper 机票种类Mapper;
	
	@Override
	public List<机票种类> find机票种类By执飞航班编号(String 执飞航班编号) {
		return this.机票种类Mapper.find机票种类By执飞航班编号(执飞航班编号);
	}

	@Override
	public 机票种类 find机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号) {
		return this.机票种类Mapper.find机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
	}

	@Override
	public List<机票种类> findAll机票种类() {
		return this.机票种类Mapper.findAll机票种类();
	}

	@Override
	public void update机票种类(机票种类 机票种类) {
		this.机票种类Mapper.update机票种类(机票种类);
	}

	@Override
	public void insert机票种类(机票种类 机票种类) {
		this.机票种类Mapper.insert机票种类(机票种类);
	}

	@Override
	public void delete机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号) {
		this.机票种类Mapper.delete机票种类By执飞航班编号And舱位编号(执飞航班编号, 舱位编号);
	}

}
