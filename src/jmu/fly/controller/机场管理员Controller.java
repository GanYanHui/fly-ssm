package jmu.fly.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jmu.fly.po.ִ�ɺ���;
import jmu.fly.service.ִ�ɺ���Service;
import jmu.fly.service.��������ԱService;

@Controller
@RequestMapping(value = "/apadmin")
public class ��������ԱController {

	@Resource(name = "��������ԱServiceImpl")
	private ��������ԱService ��������ԱService;
	
	@Resource(name = "ִ�ɺ���ServiceImpl")
	private ִ�ɺ���Service ִ�ɺ���Service;
	
	@RequestMapping(value = "/findAllִ�ɺ���in_6.do")
	public String findAllִ�ɺ���in_6(Model model) {
		
		List<ִ�ɺ���> listִ�ɺ��� = ִ�ɺ���Service.findAllִ�ɺ���();
		List<ִ�ɺ���> listִ�ɺ���new = new ArrayList<ִ�ɺ���>();
		
		for (ִ�ɺ��� ִ�ɺ��� : listִ�ɺ���) {
			String ִ������ = ִ�ɺ���.getִ������();
			String Ԥ�����ʱ�� = ִ�ɺ���.getԤ�����ʱ��();
			String Ԥ�Ƶ���ʱ�� = ִ�ɺ���.getԤ�Ƶ���ʱ��();
			String ʵ�����ʱ�� = ִ�ɺ���.getʵ�����ʱ��();
			String ʵ�ʵ���ʱ�� = ִ�ɺ���.getʵ�ʵ���ʱ��();
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Date now = new Date();
			Date exp_start_date = null;
			Date exp_end_date = null;
			Date rea_start_date = null;
			Date rea_end_date = null;
			
			boolean flag = false;
			System.out.println(now);
			
			try {
				if(Ԥ�����ʱ�� != null){
					exp_start_date = df.parse(ִ������ + " " +Ԥ�����ʱ��);
					long l1 = now.getTime() - exp_start_date.getTime();
					long hour1 = (l1/(60*60*1000)) % 24;
					System.out.println(hour1);
					if(hour1 < 6 && hour1 > -6){//��������,��ǰ/��6Сʱ��
						flag = true;
					}
					System.out.println("1.Ԥ�����ʱ��: " +exp_start_date);
				}
				if(Ԥ�Ƶ���ʱ�� != null){
					exp_end_date = df.parse(ִ������ + " " +Ԥ�Ƶ���ʱ��);
					long l2 = now.getTime() - exp_end_date.getTime();
					long hour2 = (l2/(60*60*1000)) % 24;
					System.out.println(hour2);
					if(hour2 < 6 && hour2 > -6){//��������,��ǰ/��6Сʱ��
						flag = true;
					}
					System.out.println("2.Ԥ�Ƶ���ʱ��: " +exp_end_date);
				}
				if(ʵ�����ʱ�� != null){
					rea_start_date = df.parse(ִ������ + " " +ʵ�����ʱ��);
					long l3 = now.getTime() - rea_start_date.getTime();
					long hour3 = (l3/(60*60*1000)) % 24;
					System.out.println(hour3);
					if(hour3 < 6 && hour3 > -6){//��������,��ǰ/��6Сʱ��
						flag = true;
					}
					System.out.println("3.ʵ�����ʱ��: " +rea_start_date);
				}
				if(ʵ�ʵ���ʱ�� != null){
					rea_end_date = df.parse(ִ������ + " " +ʵ�ʵ���ʱ��);
					long l4 = now.getTime() - rea_end_date.getTime();
					long hour4 = (l4/(60*60*1000)) % 24;
					System.out.println(hour4);
					if(hour4 < 6 && hour4 > -6){//��������,��ǰ/��6Сʱ��
						flag = true;
					}
					System.out.println("4.ʵ�ʵ���ʱ��: " +rea_end_date);
				}
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if(flag){
				listִ�ɺ���new.add(ִ�ɺ���);
				System.out.println("��ӳɹ�!!");
			}
			
		}
		model.addAttribute("listִ�ɺ���", listִ�ɺ���new);

		return "apadmin/allִ�ɺ���";
	}
	
	
}
