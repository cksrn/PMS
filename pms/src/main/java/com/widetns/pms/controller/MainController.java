package com.widetns.pms.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView member(ModelAndView model, Map map) throws Exception {
	/*	System.out.println("#####################");
		LOGGER.debug("Home.jsp 페이지 Info 로그레벨 ");
		LOGGER.info("Home.jsp 페이지 Info 로그레벨 ");
		LOGGER.error("Home.jsp 페이지 Info 로그레벨 ");
		LOGGER.info(Marker.class);
		readFile();
		System.out.println("#####################");

		System.out.println(authService.selectMember(map));*/
		model.setViewName("welcome");
		return model;
	}
}