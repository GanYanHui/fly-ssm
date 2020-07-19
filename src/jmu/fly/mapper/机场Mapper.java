package jmu.fly.mapper;

import java.util.List;

import jmu.fly.po.机场;

public interface 机场Mapper {
	
	public List<机场> find机场By机场名称(String 机场名称);
}
