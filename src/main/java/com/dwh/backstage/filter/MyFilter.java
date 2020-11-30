package com.dwh.backstage.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebFilter("/*")
//public class MyFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
//        String username = (String) httpServletRequest.getSession().getAttribute("username");
//        if (username != null){
//            filterChain.doFilter(httpServletRequest, httpServletResponse);
//        }else {
//            httpServletResponse.sendRedirect("/layuimini/page/login.html");
//        }
//    }
//}
