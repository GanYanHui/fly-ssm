package jmu.fly.mapper;

import java.util.List;

import jmu.fly.po.选座表;

public interface 选座表Mapper {

	public List<选座表> findAll选座表();
	
	public void update选座表(选座表 选座表);
}
