package jmu.fly.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jmu.fly.po.÷¥∑…∫Ω∞‡;
import jmu.fly.service.÷¥∑…∫Ω∞‡Service;
import jmu.fly.mapper.÷¥∑…∫Ω∞‡Mapper;

@Service
@Transactional
public class ÷¥∑…∫Ω∞‡ServiceImpl implements ÷¥∑…∫Ω∞‡Service {

	@Resource(name = "÷¥∑…∫Ω∞‡Mapper")
	private ÷¥∑…∫Ω∞‡Mapper ÷¥∑…∫Ω∞‡Mapper;
	
	@Override
	public List<÷¥∑…∫Ω∞‡> find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈(String ∫Ω∞‡±‡∫≈) {
		return this.÷¥∑…∫Ω∞‡Mapper.find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈(∫Ω∞‡±‡∫≈);
	}

	@Override
	public List<÷¥∑…∫Ω∞‡> find÷¥∑…∫Ω∞‡By÷¥∑…»’∆⁄(String ÷¥∑…»’∆⁄) {
		return this.÷¥∑…∫Ω∞‡Mapper.find÷¥∑…∫Ω∞‡By÷¥∑…»’∆⁄(÷¥∑…»’∆⁄);
	}

	@Override
	public ÷¥∑…∫Ω∞‡ find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈And÷¥∑…»’∆⁄(String ∫Ω∞‡±‡∫≈, String ÷¥∑…»’∆⁄) {
		return this.÷¥∑…∫Ω∞‡Mapper.find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈And÷¥∑…»’∆⁄(∫Ω∞‡±‡∫≈, ÷¥∑…»’∆⁄);
	}

	@Override
	public List<÷¥∑…∫Ω∞‡> findAll÷¥∑…∫Ω∞‡() {
		return this.÷¥∑…∫Ω∞‡Mapper.findAll÷¥∑…∫Ω∞‡();
	}

	@Override
	public ÷¥∑…∫Ω∞‡ find÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(String ÷¥∑…∫Ω∞‡±‡∫≈) {
		return this.÷¥∑…∫Ω∞‡Mapper.find÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(÷¥∑…∫Ω∞‡±‡∫≈);
	}

	@Override
	public void update÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡ ÷¥∑…∫Ω∞‡) {
		this.÷¥∑…∫Ω∞‡Mapper.update÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡);
	}

	@Override
	public void insert÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡ ÷¥∑…∫Ω∞‡) {
		this.÷¥∑…∫Ω∞‡Mapper.insert÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡);
	}

	@Override
	public void delete÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(String ÷¥∑…∫Ω∞‡±‡∫≈) {
		this.÷¥∑…∫Ω∞‡Mapper.delete÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(÷¥∑…∫Ω∞‡±‡∫≈);
	}

}
