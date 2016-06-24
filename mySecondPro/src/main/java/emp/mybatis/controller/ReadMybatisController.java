package emp.mybatis.controller;

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
public class ReadMybatisController{
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/mybatisread.do", method=RequestMethod.GET)
	protected ModelAndView showpage(HttpServletRequest req,
												String id) throws Exception {
			ModelAndView mav = new ModelAndView();			
			mav.addObject("emp", service.read(id));
			mav.setViewName("detail");
			return mav;
	}

}
