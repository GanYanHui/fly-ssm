package jmu.fly.service;

import java.util.List;

import jmu.fly.po.机票种类;

public interface 机票种类Service {

	public List<机票种类> find机票种类By执飞航班编号(String 执飞航班编号);
	
	public 机票种类 find机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号);
	
	public List<机票种类> findAll机票种类();
	
	public void update机票种类(机票种类 机票种类);
	
	public void insert机票种类(机票种类 机票种类);
	
	public void delete机票种类By执飞航班编号And舱位编号(String 执飞航班编号, String 舱位编号);
	
}
