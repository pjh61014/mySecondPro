package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class UpdateController{
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/read.do", method=RequestMethod.GET)
	protected ModelAndView showpage(HttpServletRequest req,
												String id) throws Exception {
			ModelAndView mav = new ModelAndView();			
			mav.addObject("emp", service.read(id));
			mav.setViewName("detail");
			return mav;
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	protected ModelAndView showpage(HttpServletRequest req,
												MyEmpDTO userInfo) throws Exception {
			System.out.println(userInfo.getId()+"  "+userInfo.getAddr());
			ModelAndView mav = new ModelAndView();			
			mav.addObject("userInfo", userInfo);
			mav.setViewName("update");
			return mav;
	}
	
	@RequestMapping(value="/member_update.do", method=RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
													MyEmpDTO userInfo) throws Exception {			
			ModelAndView mav = new ModelAndView();
			service.update(userInfo);
			mav.setViewName("redirect:list.do");
			return mav;
	}

}
