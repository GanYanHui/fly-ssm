package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.mapper.��Ʊ����Mapper;
import jmu.fly.po.��Ʊ����;
import jmu.fly.service.��Ʊ����Service;

@Service
@Transactional
public class ��Ʊ����ServiceImpl implements ��Ʊ����Service {

	@Resource(name = "��Ʊ����Mapper")
	private ��Ʊ����Mapper ��Ʊ����Mapper;
	
	@Override
	public List<��Ʊ����> find��Ʊ����Byִ�ɺ�����(String ִ�ɺ�����) {
		return this.��Ʊ����Mapper.find��Ʊ����Byִ�ɺ�����(ִ�ɺ�����);
	}

	@Override
	public ��Ʊ���� find��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���) {
		return this.��Ʊ����Mapper.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
	}

	@Override
	public List<��Ʊ����> findAll��Ʊ����() {
		return this.��Ʊ����Mapper.findAll��Ʊ����();
	}

	@Override
	public void update��Ʊ����(��Ʊ���� ��Ʊ����) {
		this.��Ʊ����Mapper.update��Ʊ����(��Ʊ����);
	}

	@Override
	public void insert��Ʊ����(��Ʊ���� ��Ʊ����) {
		this.��Ʊ����Mapper.insert��Ʊ����(��Ʊ����);
	}

	@Override
	public void delete��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���) {
		this.��Ʊ����Mapper.delete��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
	}

}
