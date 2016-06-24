package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/emp/test.do")
	public ModelAndView handleRequest(){
		//������ ��� ������ �����Ϳ� ���� ������ ���� �ִ� ��ü
		ModelAndView mav = new ModelAndView();
		//������ �����͸� ���� - request.setAttribute("msg","���������� �Ѿ�� ������")
		mav.addObject("msg", "���������� �Ѿ�� ������~~~~~~~~~~~~~~~~~");
		//forward�� �信 ���� ������ ����
		mav.setViewName("test");
		return mav;
	}

}
