package com.fengfan.web.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

/**
 * @author fengfan
 * @description 测试filter的异常
 * @date 2022/5/11 17:20
 */

//@WebFilter("/*")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) {
        System.out.println("doFilter");
    }

    @Override
    public void destroy() {

    }

}
