package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.��λ��Mapper;
import jmu.fly.po.��λ��;
import jmu.fly.service.��λ��Service;

@Service
@Transactional
public class ��λ��ServiceImpl implements ��λ��Service {

	@Resource(name = "��λ��Mapper")
	private ��λ��Mapper ��λ��Mapper;
	
	@Override
	public List<��λ��> findAll��λ��() {
		return this.��λ��Mapper.findAll��λ��();
	}

}
