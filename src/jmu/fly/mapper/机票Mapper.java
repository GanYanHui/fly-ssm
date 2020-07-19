package jmu.fly.mapper;

import java.util.List;

import jmu.fly.po.机票;

public interface 机票Mapper {

	public List<机票> findAll机票();
	
	public List<机票> find机票By执飞航班编号(String 执飞航班编号);
	
	public void insert机票(机票 机票);
	
	public List<机票> find机票By订单号(String 订单号);
}
