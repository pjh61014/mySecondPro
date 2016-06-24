package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDTO;
import board.service.BoardService;
import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class RegistController {
	@Autowired
	BoardService service;
	
	//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
	@RequestMapping(value="/regist.do", method=RequestMethod.GET)
	public String showPage(){
		return "board/write";
	}
	
	//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ��� ����
	@RequestMapping(value="/regist.do", method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req,
								  BoardDTO board){
		service.register(board);
		return new ModelAndView("redirect:index.do");
	}
}
