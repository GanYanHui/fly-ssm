package jmu.fly.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.����ԱMapper;
import jmu.fly.po.����Ա;
import jmu.fly.service.����ԱService;

@Service
@Transactional
public class ����ԱServiceImpl implements ����ԱService {

	@Resource(name = "����ԱMapper")
	private ����ԱMapper ����ԱMapper;
	
	@Override
	public ����Ա find����ԱBy��¼id(String ��¼id) {
		return this.����ԱMapper.find����ԱBy��¼id(��¼id);
	}

}
