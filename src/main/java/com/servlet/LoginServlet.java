package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;


public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String error = null;
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		try{
			subject.login(token);
		} catch(UnknownAccountException e){
			error = "用户名/密码错误";
		} catch (IncorrectCredentialsException e) {
			error = "用户名/密码错误";
		}catch (AuthenticationException e) {
			error = "其他错误:"+e.getMessage();
		}
		
		if(error != null){//出错了，返回登录页面
			req.setAttribute("error", error);
			req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
		}else{//登录成功
			req.getRequestDispatcher("/WEB-INF/jsp/loginSuccess.jsp").forward(req, resp);
		}
	}
}