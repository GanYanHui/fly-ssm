package jmu.fly.service;

import java.util.List;

import jmu.fly.po.航线;

public interface 航线Service {

	public 航线 find航线By城市(String 出发城市, String 到达城市);
	
	public List<航线> findAll航线();
	
}
