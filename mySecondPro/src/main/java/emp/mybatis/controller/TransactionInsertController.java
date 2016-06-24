package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class TransactionInsertController {
	@Autowired
	MyEmpService service;
	
	//get방식으로 요청될때 실행할 메소드 - insert페이지를 response
	@RequestMapping(value="/txInsert.do", method=RequestMethod.GET)
	public String showPage(){
		return "tx/input";
	}
	
	//post방식으로 요청될때 실행할 메소드 - 실제 db에 insert를 하기 위한 기능 수행
	@RequestMapping(value="/txInsert.do", method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req,
								  MyEmpDTO user, String id){
		System.out.println(user+"===="+id);
		service.txinsert(user);
		return new ModelAndView("redirect:mybatislist.do");
	}
}
