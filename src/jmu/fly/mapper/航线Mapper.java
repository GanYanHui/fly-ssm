package jmu.fly.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jmu.fly.po.航线;

public interface 航线Mapper {

	public 航线 find航线By城市(@Param("出发城市")String 出发城市, @Param("到达城市")String 到达城市);
	
	public List<航线> findAll航线();
}
