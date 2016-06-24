package kr.kitri.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController{ 
	@RequestMapping("/index.do")
	public String main(){
		System.out.println("어노테이션");
		return "index";
	}
}
