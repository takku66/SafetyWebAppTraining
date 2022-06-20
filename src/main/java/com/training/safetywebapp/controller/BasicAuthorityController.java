package com.training.safetywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicAuthorityController {

	@RequestMapping(value="/basicAuthority", method= {RequestMethod.POST , RequestMethod.GET})
	public ModelAndView init(ModelAndView mav) {

		mav.setViewName("BasicAuthority.html");
		return mav;
	}


}
