package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.÷¥∑…∫Ω∞‡;

public interface ÷¥∑…∫Ω∞‡Mapper {
	
	public List<÷¥∑…∫Ω∞‡> find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈(String ∫Ω∞‡±‡∫≈);

	public List<÷¥∑…∫Ω∞‡> find÷¥∑…∫Ω∞‡By÷¥∑…»’∆⁄(String ÷¥∑…»’∆⁄);
	
	public ÷¥∑…∫Ω∞‡ find÷¥∑…∫Ω∞‡By∫Ω∞‡±‡∫≈And÷¥∑…»’∆⁄(@Param("∫Ω∞‡±‡∫≈")String ∫Ω∞‡±‡∫≈, @Param("÷¥∑…»’∆⁄")String ÷¥∑…»’∆⁄);
	
	public List<÷¥∑…∫Ω∞‡> findAll÷¥∑…∫Ω∞‡();
	
	public ÷¥∑…∫Ω∞‡ find÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(String ÷¥∑…∫Ω∞‡±‡∫≈);
	
	public void update÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡ ÷¥∑…∫Ω∞‡);
	
	public void insert÷¥∑…∫Ω∞‡(÷¥∑…∫Ω∞‡ ÷¥∑…∫Ω∞‡);
	
	public void delete÷¥∑…∫Ω∞‡By÷¥∑…∫Ω∞‡±‡∫≈(String ÷¥∑…∫Ω∞‡±‡∫≈);
	
}
