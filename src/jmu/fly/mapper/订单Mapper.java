package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.订单;

public interface 订单Mapper {

	public 订单 find订单By订单号(String 订单号);
	
	public void insert订单(订单 订单);
	
	public List<订单> findAll订单();
	
	public void update订单(@Param("订单号")String 订单号, @Param("订单状态")String 订单状态);
	
	public List<订单> find订单By用户id(String 用户id);
}
