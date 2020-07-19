package jmu.fly.mapper;

import java.util.List;

import jmu.fly.po.候机楼;

public interface 候机楼Mapper {
	
	public 候机楼 find候机楼By候机楼编号(String 候机楼编号);
	
	public List<候机楼> find候机楼By机场编号(String 机场编号);
	
	public List<候机楼> findAll候机楼();
}
