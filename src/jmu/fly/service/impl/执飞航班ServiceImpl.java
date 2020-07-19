package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.ִ�ɺ���;
import jmu.fly.service.ִ�ɺ���Service;
import jmu.fly.mapper.ִ�ɺ���Mapper;

@Service
@Transactional
public class ִ�ɺ���ServiceImpl implements ִ�ɺ���Service {

	@Resource(name = "ִ�ɺ���Mapper")
	private ִ�ɺ���Mapper ִ�ɺ���Mapper;
	
	@Override
	public List<ִ�ɺ���> findִ�ɺ���By������(String ������) {
		return this.ִ�ɺ���Mapper.findִ�ɺ���By������(������);
	}

	@Override
	public List<ִ�ɺ���> findִ�ɺ���Byִ������(String ִ������) {
		return this.ִ�ɺ���Mapper.findִ�ɺ���Byִ������(ִ������);
	}

	@Override
	public ִ�ɺ��� findִ�ɺ���By������Andִ������(String ������, String ִ������) {
		return this.ִ�ɺ���Mapper.findִ�ɺ���By������Andִ������(������, ִ������);
	}

	@Override
	public List<ִ�ɺ���> findAllִ�ɺ���() {
		return this.ִ�ɺ���Mapper.findAllִ�ɺ���();
	}

	@Override
	public ִ�ɺ��� findִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����) {
		return this.ִ�ɺ���Mapper.findִ�ɺ���Byִ�ɺ�����(ִ�ɺ�����);
	}

	@Override
	public void updateִ�ɺ���(ִ�ɺ��� ִ�ɺ���) {
		this.ִ�ɺ���Mapper.updateִ�ɺ���(ִ�ɺ���);
	}

	@Override
	public void insertִ�ɺ���(ִ�ɺ��� ִ�ɺ���) {
		this.ִ�ɺ���Mapper.insertִ�ɺ���(ִ�ɺ���);
	}

	@Override
	public void deleteִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����) {
		this.ִ�ɺ���Mapper.deleteִ�ɺ���Byִ�ɺ�����(ִ�ɺ�����);
	}

}
