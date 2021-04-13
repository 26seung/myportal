package com.bitacademy.myportal.contoller.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping("/main")
	public ModelAndView home() {
		// Spring 기본 응답 객체는  ModelAndView
		// 데이터(Model) 의 뷰 객체의 정보를 함께 가지고 있다.
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/home.jsp");
		
		return mav;
	}
}
