package com.hr.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/** 
 * 不允许直接访问Controller 
 * 所有对Controller的直接访问，跳转到首页面   login.jsp
 * @author yys 
 * 
 */ 
//拦截器
public class CheckUserInterceptor implements HandlerInterceptor {

	//在访问controller方法之前调用
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		
		String uri = request.getRequestURI();
		//System.out.println("springmvc---Controller拦截器：" + uri);
		
		//如果是登录操作，则允许直接往下执行
		if(uri.indexOf("login") > 0){
			return true;
		}else if(uri.indexOf("checkname")>0){
			return true;
		}
		HttpSession session = request.getSession();
		if(session.getAttribute("username") == null){//用户未登录
			System.out.println("springmvc---Controller拦截器：拦截未登录直接访问Controller，跳转至login.jsp");
			response.sendRedirect(request.getContextPath() + "/login.jsp");
			return false;
		}else{//用户已登录
			return true;
		}
	}
	
	//在调用Controller方法之后，但是在 return ModelAndView之前调用
	public void postHandle(HttpServletRequest arg0, HttpServletResponse request,
			Object response, ModelAndView arg3) throws Exception {

		//System.out.println("spring拦截器：postHandle");
	}
	
	//在Controller完全调用完成后调用
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		
		//System.out.println("spring拦截器：afterCompletion");
	}

}
