package com.training.safetywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OpenRedirectController {

	@RequestMapping(value="/openRedirect", method= {RequestMethod.POST , RequestMethod.GET})
	public ModelAndView init(ModelAndView mav) {

		mav.setViewName("OpenRedirect.html");
		return mav;
	}


}
