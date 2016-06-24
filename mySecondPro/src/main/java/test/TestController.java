package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/emp/test.do")
	public ModelAndView handleRequest(){
		//응답할 뷰와 공유할 데이터에 대한 정보를 갖고 있는 객체
		ModelAndView mav = new ModelAndView();
		//공유할 데이터를 정의 - request.setAttribute("msg","스프링에서 넘어온 데이터")
		mav.addObject("msg", "스프링에서 넘어온 데이터~~~~~~~~~~~~~~~~~");
		//forward할 뷰에 대한 정보를 정의
		mav.setViewName("test");
		return mav;
	}

}
