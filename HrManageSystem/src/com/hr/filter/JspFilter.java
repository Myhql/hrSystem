package com.hr.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 
 * 不允许直接访问jsp 
 * 所有对jsp的直接访问，跳转到首页面 
 * @author yys 
 * 
 */  
public class JspFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;  
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        
        String uri = request.getRequestURI();
        //System.out.println("web---过滤器：" + uri);
        
        if(session.getAttribute("username") == null){//未登录
        	if(uri.endsWith(".jsp") && !(uri.indexOf("login")>0) ) {
        		System.out.println("web---过滤器：过滤未登录直接访问除login.jsp的其他*.jsp资源，跳转至login.jsp");
        		response.sendRedirect(request.getContextPath() + "/login.jsp");  
        		return;  
        	} 
        }else{//已登录
        	if(uri.endsWith("/") || uri.endsWith("login.jsp")) {
        		System.out.println("web---过滤器：用户已登录，访问登录页面直接跳转至index.jsp");
        		response.sendRedirect(request.getContextPath() + "/index.jsp");  
        		return;
        	}
        }
        chain.doFilter(req, resp);  
	}

	public void destroy() {
	}
}
