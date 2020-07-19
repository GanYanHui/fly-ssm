package jmu.fly.mapper;

import java.util.List;

import jmu.fly.po.用户;

public interface 用户Mapper {
	
	public 用户 find用户By用户id(String 用户id);

	public 用户 find用户By登录id(String 登录id);
	
	public List<用户> findAll用户();
	
	public void insert用户(用户 用户);
	
}
