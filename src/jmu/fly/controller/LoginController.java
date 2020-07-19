package jmu.fly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.机场管理员;
import jmu.fly.po.用户;
import jmu.fly.po.用户组;
import jmu.fly.po.管理员;
import jmu.fly.service.机场管理员Service;
import jmu.fly.service.用户Service;
import jmu.fly.service.用户组Service;
import jmu.fly.service.管理员Service;

@Controller
public class LoginController {

	@Resource(name = "用户ServiceImpl")
	private 用户Service 用户Service;

	@Resource(name = "管理员ServiceImpl")
	private 管理员Service 管理员Service;

	@Resource(name = "机场管理员ServiceImpl")
	private 机场管理员Service 机场管理员Service;
	
	@Resource(name = "用户组ServiceImpl")
	private 用户组Service 用户组Service;

	@RequestMapping(value = "/用户LoginCheck.do")
 	public String 用户LoginCheck(String 登录id, String 登录密码, Model model) {
		String path = "用户Login";
		try {
			用户 user = this.用户Service.find用户By登录id(登录id);
			if (user.get登录密码().equals(登录密码)) {
				path = "query";
				model.addAttribute("用户", user);
			} else {
				model.addAttribute("err", "错误的用户登录id及密码");
			}
		} catch (Exception e) {
			model.addAttribute("err", "错误的用户登录id及密码");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/管理员LoginCheck.do")
	public String 管理员LoginCheck(String 登录id, String 登录密码, Model model) {
		String path = "管理员Login";
		try {
			管理员 admin = this.管理员Service.find管理员By登录id(登录id);
			if (admin.get登录密码().equals(登录密码)) {
				path = "/admin/managementOptions";
				model.addAttribute("管理员", admin);
			} else {
				model.addAttribute("err", "错误的管理员登录id及密码");
			}
		} catch (Exception e) {
			model.addAttribute("err", "错误的管理员登录id及密码");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/机场管理员LoginCheck.do")
	public String 机场管理员LoginCheck(String 登录id, String 登录密码, Model model) {
		String path = "机场管理员Login";
		try {
			机场管理员 apAdmin = this.机场管理员Service.find机场管理员By登录id(登录id);
			if (apAdmin.get登录密码().equals(登录密码)) {
				path = "/apadmin/managementOptions";
				model.addAttribute("机场管理员", apAdmin);
			} else {
				model.addAttribute("err", "错误的机场管理员登录id及密码");
			}
		} catch (Exception e) {
			model.addAttribute("err", "错误的机场管理员登录id及密码");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/insert用户.do")
	public String insert用户(String 登录id, String 登录密码, String 联系电话, String 邮箱, String 用户姓名, String 用户身份证号, String 用户性别,
			int 用户年龄, Model model) {
		
		List<用户> list用户 = 用户Service.findAll用户();
		int num = list用户.size() + 1;
		
		用户组 用户组 = new 用户组();
		用户组.set登录id(登录id);
		用户组.set登录密码(登录密码);
		用户组.set联系电话(联系电话);
		用户组.set邮箱(邮箱);
		try {
			用户组Service.insert用户组(用户组);
			System.out.println("插入用户组成功!!");
		} catch (Exception e) {
			System.out.println("插入用户组失败!!");
		}
		
		用户 user = new 用户();
		user.set登录id(登录id);
		user.set用户id(""+num);
		user.set登录密码(登录密码);
		user.set联系电话(联系电话);
		user.set邮箱(邮箱);
		user.set用户姓名(用户姓名);
		user.set用户身份证号(用户身份证号);
		user.set用户性别(用户性别);
		user.set用户年龄(用户年龄);
		user.set用户积分(0);
		boolean flag = false;
		try {
			用户Service.insert用户(user);
			flag = true;
			System.out.println("插入用户成功!!");
		} catch (Exception e) {
			System.out.println("插入用户失败!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "insert用户_do";
	}

}
