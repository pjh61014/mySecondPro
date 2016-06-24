package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class LoginMybatisController{
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/mybatis_login.do", method=RequestMethod.GET)
	public String showPage(){
		return "login/form";
	}
	
	@RequestMapping(value="/mybatis_login.do", method=RequestMethod.POST)
	protected String login(HttpServletRequest req,
												String id, String pass) throws Exception {
			String url="";
			MyEmpDTO emp = new MyEmpDTO(id, pass, "", "", "");
			MyEmpDTO User = service.login(emp);
			if(User!=null){
				req.getSession().setAttribute("User", User);
				url="index";
			}else{
				url="login/form";
			}
			
			return url;
	}

}
