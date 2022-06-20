package com.training.safetywebapp.filter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasicAuthorityFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		String reqAuth = "" + req.getHeader("Authorization");
		String basicAuth = Base64.getEncoder().encodeToString("user:pass".getBytes(StandardCharsets.UTF_8));
		if(!reqAuth.replaceAll("Basic\\s","").equals(basicAuth)) {
			res.setStatus(401);
			res.setHeader("WWW-Authenticate", "Basic realm=\"Test Basic Authorication\"");
		}
		chain.doFilter(request, response);

		System.out.println("フィルターかけられたよ");
	}

}
