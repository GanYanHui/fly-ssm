package jmu.fly.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.���¥;
import jmu.fly.po.ִ�ɺ���;
import jmu.fly.po.����;
import jmu.fly.po.��Ʊ����;
import jmu.fly.po.����;
import jmu.fly.po.����;
import jmu.fly.po.��λ;
import jmu.fly.service.���¥Service;
import jmu.fly.service.ִ�ɺ���Service;
import jmu.fly.service.����Service;
import jmu.fly.service.��Ʊ����Service;
import jmu.fly.service.����ԱService;
import jmu.fly.service.����Service;
import jmu.fly.service.����Service;
import jmu.fly.service.��λService;

@Controller
@RequestMapping(value = "/admin")
public class ����ԱController {

	@Resource(name = "����ԱServiceImpl")
	private ����ԱService ����ԱService;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "ִ�ɺ���ServiceImpl")
	private ִ�ɺ���Service ִ�ɺ���Service;

	@Resource(name = "��Ʊ����ServiceImpl")
	private ��Ʊ����Service ��Ʊ����Service;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "���¥ServiceImpl")
	private ���¥Service ���¥Service;

	@Resource(name = "��λServiceImpl")
	private ��λService ��λService;

	@RequestMapping(value = "/findAll����.do")
	public String findAll����(Model model) {
		
		List<����> list���� = ����Service.findAll����();

		model.addAttribute("list����", list����);

		return "admin/all����";
	}

	@RequestMapping(value = "/findAllִ�ɺ���.do")
	public String findAllִ�ɺ���(Model model) {
		
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findAllִ�ɺ���();

		model.addAttribute("listִ�ɺ���", listִ�ɺ���);

		return "admin/allִ�ɺ���";
	}

	@RequestMapping(value = "/findAll��Ʊ����.do")
	public String findAll��Ʊ����(Model model) {
		
		List<��Ʊ����> list��Ʊ���� = ��Ʊ����Service.findAll��Ʊ����();

		model.addAttribute("list��Ʊ����", list��Ʊ����);

		return "admin/all��Ʊ����";
	}

	@RequestMapping(value = "/find����By������.do")
	public String find����By������(String ������, Model model) {
		
		���� ���� = ����Service.find����By������(������);
		List<����> list���� = ����Service.findAll����();
		List<����> list���� = ����Service.findAll����();
		List<���¥> list���¥ = ���¥Service.findAll���¥();

		model.addAttribute("����", ����);
		model.addAttribute("list����", list����);
		model.addAttribute("list����", list����);
		model.addAttribute("list���¥", list���¥);

		return "admin/update����";
	}

	@RequestMapping(value = "/findִ�ɺ���Byִ�ɺ�����.do")
	public String findִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����, Model model) {
		
		ִ�ɺ��� ִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���Byִ�ɺ�����(ִ�ɺ�����);
		List<����> list���� = ����Service.findAll����();

		model.addAttribute("ִ�ɺ���", ִ�ɺ���);
		model.addAttribute("list����", list����);
		
		return "admin/updateִ�ɺ���";
	}

	@RequestMapping(value = "/find��Ʊ����Byִ�ɺ�����And��λ���.do")
	public String find��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���, Model model) {
		��Ʊ���� ��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
		
		List<��λ> list��λ = ��λService.findAll��λ();
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findAllִ�ɺ���();

		model.addAttribute("��Ʊ����", ��Ʊ����);
		model.addAttribute("list��λ", list��λ);
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);

		return "admin/update��Ʊ����";
	}

	@RequestMapping(value = "/update����.do")
	public String update����(String ������, String ���߱��, String ���ͱ��, String �����غ��¥���, String Ŀ�ĵغ��¥���, String �ƻ����ʱ��,
			String �ƻ�����ʱ��, Model model) {

		���� ���� = new ����();
		����.set������(������);
		����.set���߱��(���߱��);
		����.set���ͱ��(���ͱ��);
		����.set�����غ��¥���(�����غ��¥���);
		����.setĿ�ĵغ��¥���(Ŀ�ĵغ��¥���);
		����.set�ƻ����ʱ��(�ƻ����ʱ��);
		����.set�ƻ�����ʱ��(�ƻ�����ʱ��);
		boolean flag = false;
		try {
			����Service.update����(����);
			flag = true;
			System.out.println("�������!");
		} catch (Exception e) {
			System.out.println("����ʧ��!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/update����_do";
	}

	@RequestMapping(value = "/updateִ�ɺ���.do")
	public String updateִ�ɺ���(String ִ�ɺ�����, String ������, String ִ������, Double ִ�м۸�, String Ԥ�����ʱ��, String Ԥ�Ƶ���ʱ��,
			String ʵ�����ʱ��, String ʵ�ʵ���ʱ��, String ״̬, String �ǻ���, String �ǻ�ʱ��, Model model) {

		ִ�ɺ��� ִ�ɺ��� = new ִ�ɺ���();
		ִ�ɺ���.setִ�ɺ�����(ִ�ɺ�����);
		ִ�ɺ���.set������(������);
		ִ�ɺ���.setִ������(ִ������);
		ִ�ɺ���.setִ�м۸�(ִ�м۸�);
		ִ�ɺ���.setԤ�����ʱ��(Ԥ�����ʱ��);
		ִ�ɺ���.setԤ�Ƶ���ʱ��(Ԥ�Ƶ���ʱ��);
		ִ�ɺ���.setʵ�����ʱ��(ʵ�����ʱ��);
		ִ�ɺ���.setʵ�ʵ���ʱ��(ʵ�ʵ���ʱ��);
		ִ�ɺ���.set״̬(״̬);
		ִ�ɺ���.set�ǻ���(�ǻ���);
		ִ�ɺ���.set�ǻ�ʱ��(�ǻ�ʱ��);
		boolean flag = false;
		try {
			ִ�ɺ���Service.updateִ�ɺ���(ִ�ɺ���);
			flag = true;
			System.out.println("�������!");
		} catch (Exception e) {
			System.out.println("����ʧ��!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/updateִ�ɺ���_do";
	}

	@RequestMapping(value = "/update��Ʊ����.do")
	public String update��Ʊ����(String ��λ���, String ִ�ɺ�����, Double ���ۼ۸�, String ��Ч��ʼ����, String ��Ч��������, Double �ۿ�, int ��Ʊ��,
			int ������, int �������, String ��ʳ״̬, String �˸�ǩ����, Model model) {

		��Ʊ���� ��Ʊ���� = new ��Ʊ����();
		��Ʊ����.set��λ���(��λ���);
		��Ʊ����.setִ�ɺ�����(ִ�ɺ�����);
		��Ʊ����.set���ۼ۸�(���ۼ۸�);
		��Ʊ����.set��Ч��ʼ����(��Ч��ʼ����);
		��Ʊ����.set��Ч��������(��Ч��������);
		��Ʊ����.set�ۿ�(�ۿ�);
		��Ʊ����.set��Ʊ��(��Ʊ��);
		��Ʊ����.set������(������);
		��Ʊ����.set�������(�������);
		��Ʊ����.set��ʳ״̬(��ʳ״̬);
		��Ʊ����.set�˸�ǩ����(�˸�ǩ����);
		boolean flag = false;
		try {
			��Ʊ����Service.update��Ʊ����(��Ʊ����);
			flag = true;
			System.out.println("�������!");
		} catch (Exception e) {
			System.out.println("����ʧ��!");
			System.out.println(e);
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/update��Ʊ����_do";
	}

	@RequestMapping(value = "/beforeInsert����.do")
	public String beforeInsert����(Model model) {
		
		List<����> list���� = ����Service.findAll����();
		List<����> list���� = ����Service.findAll����();
		List<���¥> list���¥ = ���¥Service.findAll���¥();

		model.addAttribute("list����", list����);
		model.addAttribute("list����", list����);
		model.addAttribute("list���¥", list���¥);

		return "admin/insert����";
	}

	@RequestMapping(value = "/beforeInsertִ�ɺ���.do")
	public String beforeInsertִ�ɺ���(Model model) {
		
		List<����> list���� = ����Service.findAll����();

		model.addAttribute("list����", list����);

		return "admin/insertִ�ɺ���";
	}

	@RequestMapping(value = "/beforeInsert��Ʊ����.do")
	public String beforeInsert��Ʊ����(Model model) {
		
		List<��λ> list��λ = ��λService.findAll��λ();
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findAllִ�ɺ���();
		
		System.out.println(list��λ);
		System.out.println(listִ�ɺ���);
		System.err.println("OK!");

		model.addAttribute("list��λ", list��λ);
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);

		return "admin/insert��Ʊ����";
	}

	@RequestMapping(value = "/insert����.do")
	public String insert����(String ������, String ���߱��, String ���ͱ��, String �����غ��¥���, String Ŀ�ĵغ��¥���, String �ƻ����ʱ��,
			String �ƻ�����ʱ��, Model model) {
		
		���� ���� = new ����();
		����.set������(������);
		����.set���߱��(���߱��);
		����.set���ͱ��(���ͱ��);
		����.set�����غ��¥���(�����غ��¥���);
		����.setĿ�ĵغ��¥���(Ŀ�ĵغ��¥���);
		����.set�ƻ����ʱ��(�ƻ����ʱ��);
		����.set�ƻ�����ʱ��(�ƻ�����ʱ��);
		boolean flag = false;
		try {
			����Service.insert����(����);
			flag = true;
			System.out.println("���뺽��ɹ�!!");
		} catch (Exception e) {
			System.out.println("���뺽��ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/insert����_do";
	}

	@RequestMapping(value = "/insertִ�ɺ���.do")
	public String insertִ�ɺ���(String ������, String ִ������, Double ִ�м۸�, String Ԥ�����ʱ��, String Ԥ�Ƶ���ʱ��, String ʵ�����ʱ��,
			String ʵ�ʵ���ʱ��, String ״̬, String �ǻ���, String �ǻ�ʱ��, Model model) {
		
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findAllִ�ɺ���();
		int num = listִ�ɺ���.size();
		
		ִ�ɺ��� ִ�ɺ��� = new ִ�ɺ���();
		
		ִ�ɺ���.setִ�ɺ�����("zf" + (num + 1));
		ִ�ɺ���.set������(������);
		ִ�ɺ���.setִ������(ִ������);
		ִ�ɺ���.setִ�м۸�(ִ�м۸�);
		ִ�ɺ���.setԤ�����ʱ��(Ԥ�����ʱ��);
		ִ�ɺ���.setԤ�Ƶ���ʱ��(Ԥ�Ƶ���ʱ��);
		ִ�ɺ���.setʵ�����ʱ��(ʵ�����ʱ��);
		ִ�ɺ���.setʵ�ʵ���ʱ��(ʵ�ʵ���ʱ��);
		ִ�ɺ���.set״̬(״̬);
		ִ�ɺ���.set�ǻ���(�ǻ���);
		ִ�ɺ���.set�ǻ�ʱ��(�ǻ�ʱ��);
		boolean flag = false;
		try {
			ִ�ɺ���Service.insertִ�ɺ���(ִ�ɺ���);
			flag = true;
			System.out.println("����ִ�ɺ���ɹ�!!");
		} catch (Exception e) {
			System.out.println("����ִ�ɺ���ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/insertִ�ɺ���_do";
	}

	@RequestMapping(value = "/insert��Ʊ����.do")
	public String insert��Ʊ����(String ��λ���, String ִ�ɺ�����, Double ���ۼ۸�, String ��Ч��ʼ����, String ��Ч��������, Double �ۿ�,
			int ��Ʊ��, int ������, int �������, String ��ʳ״̬, String �˸�ǩ����, Model model) {
		
		��Ʊ���� ��Ʊ���� = new ��Ʊ����();
		
		��Ʊ����.set��λ���(��λ���);
		��Ʊ����.setִ�ɺ�����(ִ�ɺ�����);
		��Ʊ����.set���ۼ۸�(���ۼ۸�);
		��Ʊ����.set��Ч��ʼ����(��Ч��ʼ����);
		��Ʊ����.set��Ч��������(��Ч��������);
		��Ʊ����.set�ۿ�(�ۿ�);
		��Ʊ����.set��Ʊ��(��Ʊ��);
		��Ʊ����.set�������(�������);
		��Ʊ����.set������(������);
		��Ʊ����.set��ʳ״̬(��ʳ״̬);
		��Ʊ����.set�˸�ǩ����(�˸�ǩ����);
		boolean flag = false;
		try {
			��Ʊ����Service.insert��Ʊ����(��Ʊ����);
			flag = true;
			System.out.println("�����Ʊ����ɹ�!!");
		} catch (Exception e) {
			System.out.println("�����Ʊ����ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/insert��Ʊ����_do";
	}

	@RequestMapping(value = "/delete����By������.do")
	public String delete����By������(String ������, Model model) {
		
		boolean flag = false;
		try {
			����Service.delete����By������(������);
			flag = true;
			System.out.println("ɾ������ɹ�!!");
		} catch (Exception e) {
			System.out.println("ɾ������ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));

		return "admin/delete����";
	}

	@RequestMapping(value = "/deleteִ�ɺ���Byִ�ɺ�����.do")
	public String deleteִ�ɺ���Byִ�ɺ�����(String ִ�ɺ�����, Model model) {
		
		boolean flag = false;
		try {
			ִ�ɺ���Service.deleteִ�ɺ���Byִ�ɺ�����(ִ�ɺ�����);
			flag = true;
			System.out.println("ɾ��ִ�ɺ���ɹ�!!");
		} catch (Exception e) {
			System.out.println("ɾ��ִ�ɺ���ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/deleteִ�ɺ���";
	}
	
	@RequestMapping(value = "/delete��Ʊ����Byִ�ɺ�����And��λ���.do")
	public String delete��Ʊ����Byִ�ɺ�����And��λ���(String ִ�ɺ�����, String ��λ���, Model model) {
		
		boolean flag = false;
		try {
			��Ʊ����Service.delete��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
			flag = true;
			System.out.println("ɾ����Ʊ����ɹ�!!");
		} catch (Exception e) {
			System.out.println("ɾ����Ʊ����ʧ��!!");
		}
		model.addAttribute("flag", new Boolean(flag));
		
		return "admin/delete��Ʊ����";
	}
	
	@RequestMapping(value = "/find����ByLike.do")
	public String find����ByLike(String string, Model model){
		
		List<����> list���� = ����Service.find����ByLike(string);

		model.addAttribute("list����", list����);
		model.addAttribute("string", string);

		return "admin/all����";
	}

}
