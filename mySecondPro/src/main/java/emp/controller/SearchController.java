package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;

@Controller
public class SearchController{
	@Autowired
	MyEmpService service;

	@RequestMapping(value="/search.do", method=RequestMethod.GET)
	public String showPage(){
		return "search/form";
	}
	
	@RequestMapping(value="/search.do", method=RequestMethod.POST)
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
												String search) throws Exception {
			ModelAndView mav = new ModelAndView();
			mav.addObject("userlist", service.findByAddr(search));
			mav.setViewName("search");
			return mav;
	}

}
