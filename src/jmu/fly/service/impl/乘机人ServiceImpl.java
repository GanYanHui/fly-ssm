package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.乘机人Mapper;
import jmu.fly.po.乘机人;
import jmu.fly.service.乘机人Service;

@Service
@Transactional
public class 乘机人ServiceImpl implements 乘机人Service {

	@Resource(name = "乘机人Mapper")
	private 乘机人Mapper 乘机人Mapper;
	
	@Override
	public 乘机人 find乘机人By乘机人身份证号(String 乘机人身份证号) {
		return this.乘机人Mapper.find乘机人By乘机人身份证号(乘机人身份证号);
	}

	@Override
	public void insert乘机人(乘机人 乘机人) {
		this.乘机人Mapper.insert乘机人(乘机人);
	}

}
