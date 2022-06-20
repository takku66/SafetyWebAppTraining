package com.training.safetywebapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class CstmErrorController implements ErrorController {

	/**
	 * エラーページのパス
	 */
	@Value("${server.error.path:${error.path:/error}}")
	private String errorPath;

	/**
	 * エラーページのパスを返す
	 */
	@Override
	public String getErrorPath() {
		return errorPath;
	}


}
