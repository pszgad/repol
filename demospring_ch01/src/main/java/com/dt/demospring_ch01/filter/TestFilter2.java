package com.dt.demospring_ch01.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/api/tesrFilter",filterName ="TestFilter02" )
public class TestFilter2 implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, @org.jetbrains.annotations.NotNull FilterChain filterChain) throws IOException, ServletException {
        System.out.println("----->执行TestFilter2");
        filterChain.doFilter(request,response);//放行
    }

    @Override
    public void destroy() {

    }
}
