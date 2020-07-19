package jmu.fly.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.�˻���;
import jmu.fly.po.���¥;
import jmu.fly.po.��λ��;
import jmu.fly.po.ִ�ɺ���;
import jmu.fly.po.����;
import jmu.fly.po.��Ʊ;
import jmu.fly.po.��Ʊ����;
import jmu.fly.po.����;
import jmu.fly.po.����;
import jmu.fly.po.����;
import jmu.fly.po.ѡ����;
import jmu.fly.service.�˻���Service;
import jmu.fly.service.���¥Service;
import jmu.fly.service.��λ��Service;
import jmu.fly.service.ִ�ɺ���Service;
import jmu.fly.service.����Service;
import jmu.fly.service.��ƱService;
import jmu.fly.service.��Ʊ����Service;
import jmu.fly.service.�û�Service;
import jmu.fly.service.����Service;
import jmu.fly.service.����Service;
import jmu.fly.service.����Service;
import jmu.fly.service.ѡ����Service;

@Controller
public class �û�Controller {

	@Resource(name = "�û�ServiceImpl")
	private �û�Service �û�Service;

	@Resource(name = "ִ�ɺ���ServiceImpl")
	private ִ�ɺ���Service ִ�ɺ���Service;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "���¥ServiceImpl")
	private ���¥Service ���¥Service;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;

	@Resource(name = "��Ʊ����ServiceImpl")
	private ��Ʊ����Service ��Ʊ����Service;
	
	@Resource(name = "�˻���ServiceImpl")
	private �˻���Service �˻���Service;
	
	@Resource(name = "����ServiceImpl")
	private ����Service ����Service;
	
	@Resource(name = "��λ��ServiceImpl")
	private ��λ��Service ��λ��Service;
	
	@Resource(name = "��ƱServiceImpl")
	private ��ƱService ��ƱService;
	
	@Resource(name = "ѡ����ServiceImpl")
	private ѡ����Service ѡ����Service;

	@RequestMapping(value = "/findִ�ɺ���Byִ������.do")
	public String findִ�ɺ���Byִ������(String ����, Model model) {
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���Byִ������(����);
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);
		return "allִ�ɺ���";
	}

	@RequestMapping(value = "/findִ�ɺ���By������.do")
	public String findִ�ɺ���By������(String ������, Model model) {
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findִ�ɺ���By������(������);
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);
		return "allִ�ɺ���";
	}

	@RequestMapping(value = "/findִ�ɺ���By��������.do")
	public String findִ�ɺ���By��������(String ��������, Model model) {
		List<����> list���� = new ArrayList<>();
		List<���¥> list���¥ = new ArrayList<>();
		List<����> list���� = new ArrayList<>();
		List<ִ�ɺ���> listִ�ɺ��� = new ArrayList<>();

		list���� = ����Service.find����By��������(��������);
		for (���� ���� : list����) {
			list���¥.addAll(���¥Service.find���¥By�������(����.get�������()));
		}
		for (���¥ ���¥ : list���¥) {
			list����.addAll(����Service.find����By���¥���(���¥.get���¥���()));
		}
		for (���� ���� : list����) {
			listִ�ɺ���.addAll(ִ�ɺ���Service.findִ�ɺ���By������(����.get������()));
		}
		
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);
		return "allִ�ɺ���";
	}

	@RequestMapping(value = "/findִ�ɺ���By����And����.do")
	public String findִ�ɺ���By����And����(String ��������, String �������, String ִ������, Model model) {
		List<ִ�ɺ���> listִ�ɺ��� = new ArrayList<>();
		���� ���� = ����Service.find����By����(��������, �������);
		List<����> list���� = ����Service.find����By���߱��(����.get���߱��());
		for (���� ���� : list����) {
			listִ�ɺ���.add(ִ�ɺ���Service.findִ�ɺ���By������Andִ������(����.get������(), ִ������));
		}
		model.addAttribute("listִ�ɺ���", listִ�ɺ���);
		return "allִ�ɺ���";
	}

	@RequestMapping(value = "/find��Ʊ����Byִ�ɺ�����.do")
	public String find��Ʊ����Byִ�ɺ�����(String ִ�ɺ�����, Model model) {
		List<��Ʊ����> list��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����(ִ�ɺ�����);
		model.addAttribute("list��Ʊ����", list��Ʊ����);
		return "��λѡ��";
	}

	@RequestMapping(value = "/prepare����.do")
	public String prepare����(String ��λ���, String ִ�ɺ�����, Model model){
		��Ʊ����	��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
		model.addAttribute("��Ʊ����", ��Ʊ����);
		return "��д����";
	}
	
	@RequestMapping(value = "/create����.do")
	public String create����(String �û�_��¼id, String �û�_�û�id, String ִ�ɺ����� ,String ��λ���, String �˻�������, String �˻������֤��, String �˻�����ϵ�绰, String �˻����Ա�, String ��ϵ�绰,
			Model model) {
		//�����˻���, ���û�, ���һ�Ʊ���������¸�ҳ����ʾ, ��������, ����֧��ҳ��
		�˻��� �˻��� = new �˻���();
		�˻���.set�˻������֤��(�˻������֤��);
		�˻���.set�˻�������(�˻�������);
		�˻���.set�˻����Ա�(�˻����Ա�);
		�˻���.set�˻�����ϵ�绰(�˻�����ϵ�绰);
		�˻���.set����״̬("100��");
		try {
			�˻���Service.insert�˻���(�˻���);
			System.out.println("�˻�����ӳɹ�!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("�˻������ʧ��!!");
		}
		
		//�˴�д��
		
		
		��Ʊ����	��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
		model.addAttribute("��Ʊ����", ��Ʊ����);
		
		���� ���� = new ����();
		Date now = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		List<����> list���� = ����Service.findAll����();
		int num = list����.size();
		
		����.set������("dd" + (num + 1));
		����.set��¼id(�û�_��¼id);
		����.set�û�id(�û�_�û�id);
		����.set��������(df.format(now));
		����.set��Ʊ��(1);
		����.set��ϵ�绰(��ϵ�绰);
		����.set���û���(100);
		����.set�ܶ�(520.0);
		����.set����״̬("����δ֧��");
		try {
			����Service.insert����(����);
			System.out.println("���������ɹ�!!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("��������ʧ��!!");
		}
		
		model.addAttribute("�˻���", �˻���);
		model.addAttribute("����", ����);
		model.addAttribute("��Ʊ����", ��Ʊ����);
		
		return "֧��ҳ��";
	}
	
	@RequestMapping(value = "/findAll��λ��.do")
	public String findAll��λ��(String �˻������֤��, String ������, String ִ�ɺ�����, String ��λ���, Model model){
		//����Ǯ�Ϳ���ѡ����,���¶�����״̬��Ϣ
		����Service.update����(������, "֧���ɹ�");
		
		�˻��� �˻��� = �˻���Service.find�˻���By�˻������֤��(�˻������֤��);
		���� ���� = ����Service.find����By������(������);
		��Ʊ���� ��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
		List<��λ��> list��λ�� = ��λ��Service.findAll��λ��();
		
		model.addAttribute("�˻���", �˻���);
		model.addAttribute("����", ����);
		model.addAttribute("��Ʊ����", ��Ʊ����);
		model.addAttribute("list��λ��", list��λ��);
		
		return "ֵ��ѡ��";
	}
	
	@RequestMapping(value = "/create��Ʊ.do")
	public String create��Ʊ(String �˻������֤��, String ������, String ��λ���, String ִ�ɺ�����, String ��λ���, Model model){
		
		List<��Ʊ> list��Ʊ = ��ƱService.findAll��Ʊ();
		��Ʊ���� ��Ʊ���� = ��Ʊ����Service.find��Ʊ����Byִ�ɺ�����And��λ���(ִ�ɺ�����, ��λ���);
		int num = list��Ʊ.size();
		
		��Ʊ ��Ʊ = new ��Ʊ();
		Double ��Ʊ����� = 100.0;
		Double ���շ� = 100.0;
		Double ��Ʊ�۸� = ��Ʊ����.get���ۼ۸�() + ��Ʊ����� + ���շ�;
		��Ʊ.set��Ʊ���("ticket" + (num + 1));
		��Ʊ.set�˻������֤��(�˻������֤��);
		System.out.println(�˻������֤��);
		��Ʊ.set������(������);
		��Ʊ.set��λ���(��Ʊ����.get��λ���());
		��Ʊ.setִ�ɺ�����(��Ʊ����.getִ�ɺ�����());
		��Ʊ.set��λ���(Integer.valueOf(��λ���));
		��Ʊ.set���������(��Ʊ�����);
		��Ʊ.set���շ�(���շ�);
		��Ʊ.set��Ʊ�۸�(��Ʊ�۸�);
		��Ʊ.set��ע(null);
		��Ʊ.setֵ��״̬(null);
		��Ʊ.set�ǻ���(null);
		
		ѡ���� ѡ���� = new ѡ����();
		ѡ����.set��λ���(Integer.valueOf(��λ���));
		ѡ����.setִ�ɺ�����(ִ�ɺ�����);
		ѡ����.set״̬("��ѡ");
		
		
		boolean flag = false;
		try {
			��ƱService.insert��Ʊ(��Ʊ);
			System.out.println("��Ʊ�ɹ�!!");
			��Ʊ����.set��Ʊ��(��Ʊ����.get��Ʊ��() - 1);
			��Ʊ����Service.update��Ʊ����(��Ʊ����);
			try {
				ѡ����Service.updateѡ����(ѡ����);
				System.err.println("ѡ����������!!");
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("ѡ�������ʧ��!!");
			}
			flag = true;
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("��Ʊʧ��!!");
		}
		
		model.addAttribute("��Ʊ", ��Ʊ);
		model.addAttribute("flag", new Boolean(flag));
		return "��Ʊ���";
	}
	
	@RequestMapping(value = "/find����By�û�id.do")
	public String find����By�û�id(String �û�id, Model model){
		System.out.println(�û�id);
		List<����> list���� = ����Service.find����By�û�id(�û�id);
		model.addAttribute("list����", list����);
		return "�ҵĶ���";
	}
	
	@RequestMapping(value = "/find��ƱBy������.do")
	public String find��ƱBy������(String ������, Model model){
		List<��Ʊ> list��Ʊ = ��ƱService.find��ƱBy������(������);
		���� ���� = ����Service.find����By������(������);
		
		model.addAttribute("����", ����);
		model.addAttribute("list��Ʊ", list��Ʊ);
		return "����+��Ʊ";
	}
	
}
