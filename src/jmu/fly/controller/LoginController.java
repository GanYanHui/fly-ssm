package jmu.fly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.��������Ա;
import jmu.fly.po.�û�;
import jmu.fly.po.�û���;
import jmu.fly.po.����Ա;
import jmu.fly.service.��������ԱService;
import jmu.fly.service.�û�Service;
import jmu.fly.service.�û���Service;
import jmu.fly.service.����ԱService;

@Controller
public class LoginController {

	@Resource(name = "�û�ServiceImpl")
	private �û�Service �û�Service;

	@Resource(name = "����ԱServiceImpl")
	private ����ԱService ����ԱService;

	@Resource(name = "��������ԱServiceImpl")
	private ��������ԱService ��������ԱService;
	
	@Resource(name = "�û���ServiceImpl")
	private �û���Service �û���Service;

	@RequestMapping(value = "/�û�LoginCheck.do")
 	public String �û�LoginCheck(String ��¼id, String ��¼����, Model model) {
		String path = "�û�Login";
		try {
			�û� user = this.�û�Service.find�û�By��¼id(��¼id);
			if (user.get��¼����().equals(��¼����)) {
				path = "query";
				model.addAttribute("�û�", user);
			} else {
				model.addAttribute("err", "������û���¼id������");
			}
		} catch (Exception e) {
			model.addAttribute("err", "������û���¼id������");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/����ԱLoginCheck.do")
	public String ����ԱLoginCheck(String ��¼id, String ��¼����, Model model) {
		String path = "����ԱLogin";
		try {
			����Ա admin = this.����ԱService.find����ԱBy��¼id(��¼id);
			if (admin.get��¼����().equals(��¼����)) {
				path = "/admin/managementOptions";
				model.addAttribute("����Ա", admin);
			} else {
				model.addAttribute("err", "����Ĺ���Ա��¼id������");
			}
		} catch (Exception e) {
			model.addAttribute("err", "����Ĺ���Ա��¼id������");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/��������ԱLoginCheck.do")
	public String ��������ԱLoginCheck(String ��¼id, String ��¼����, Model model) {
		String path = "��������ԱLogin";
		try {
			��������Ա apAdmin = this.��������ԱService.find��������ԱBy��¼id(��¼id);
			if (apAdmin.get��¼����().equals(��¼����)) {
				path = "/apadmin/managementOptions";
				model.addAttribute("��������Ա", apAdmin);
			} else {
				model.addAttribute("err", "����Ļ�������Ա��¼id������");
			}
		} catch (Exception e) {
			model.addAttribute("err", "����Ļ�������Ա��¼id������");
			e.printStackTrace();
		}
		return path;
	}

	@RequestMapping(value = "/insert�û�.do")
	public String insert�û�(String ��¼id, String ��¼����, String ��ϵ�绰, String ����, String �û�����, String �û����֤��, String �û��Ա�,
			int �û�����, Model model) {
		
		List<�û�> list�û� = �û�Service.findAll�û�();
		int num = list�û�.size() + 1;
		
		�û��� �û��� = new �û���();
		�û���.set��¼id(��¼id);
		�û���.set��¼����(��¼����);
		�û���.set��ϵ�绰(��ϵ�绰);
		�û���.set����(����);
		try {
			�û���Service.insert�û���(�û���);
			System.out.println("�����û���ɹ�!!");
		} catch (Exception e) {
			System.out.println("�����û���ʧ��!!");
		}
		
		�û� user = new �û�();
		user.set��¼id(��¼id);
		user.set�û�id(""+num);
		user.set��¼����(��¼����);
		user.set��ϵ�绰(��ϵ�绰);
		user.set����(����);
		user.set�û�����(�û�����);
		user.set�û����֤��(�û����֤��);
		user.set�û��Ա�(�û��Ա�);
		user.set�û�����(�û�����);
		user.set�û�����(0);
		boolean flag = false;
		try {
			�û�Service.insert�û�(user);
			flag = true;
			System.out.println("�����û��ɹ�!!");
		} catch (Exception e) {
			System.out.println("�����û�ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "insert�û�_do";
	}

}
