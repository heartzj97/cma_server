package com.cma.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cma.pojo.Result;

@ControllerAdvice
public class CmaExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public Result defaultErrorHandler(HttpServletRequest req, 
			Exception e) {
		//e.printStackTrace();
		return Result.errorMsg(e.getMessage());
	}

}
