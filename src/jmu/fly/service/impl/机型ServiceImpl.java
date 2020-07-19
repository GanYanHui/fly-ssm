package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.机型Mapper;
import jmu.fly.po.机型;
import jmu.fly.service.机型Service;

@Service
@Transactional
public class 机型ServiceImpl implements 机型Service {

	@Resource(name = "机型Mapper")
	private 机型Mapper 机型Mapper;
	
	@Override
	public List<机型> findAll机型() {
		return this.机型Mapper.findAll机型();
	}

}
