package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.��λMapper;
import jmu.fly.po.��λ;
import jmu.fly.service.��λService;

@Service
@Transactional
public class ��λServiceImpl implements ��λService {

	@Resource(name = "��λMapper")
	private ��λMapper ��λMapper;
	
	@Override
	public List<��λ> findAll��λ() {
		return ��λMapper.findAll��λ();
	}

}
