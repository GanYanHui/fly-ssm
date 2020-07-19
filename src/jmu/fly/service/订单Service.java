package jmu.fly.service;

import java.util.List;

import jmu.fly.po.订单;

public interface 订单Service {

	public 订单 find订单By订单号(String 订单号);
	
	public void insert订单(订单 订单);
	
	public List<订单> findAll订单();
	
	public void update订单(String 订单号, String 订单状态);
	
	public List<订单> find订单By用户id(String 用户id);
}
