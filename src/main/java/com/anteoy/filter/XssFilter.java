package com.anteoy.filter;
/** 
 * @author 作者姓名 zhilun liu  E-mail: email地址 
 * @version 创建时间：2016年5月26日 下午3:48:11 
 * 类说明 
 */
/**
 * @author zoro
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class XssFilter implements Filter {

	 /* (non-Javadoc) 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) 
     */  
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
            ServletException {  
          
            XssHttpServletRequestWrapper xssRequest = new XssHttpServletRequestWrapper(  
            (HttpServletRequest) request);  
            filterChain.doFilter(xssRequest, response);
    }

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void destroy() {
		
	}  
}