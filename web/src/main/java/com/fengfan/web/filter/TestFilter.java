package com.fengfan.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author fengfan
 * @description 测试filter的异常
 * @date 2022/5/11 17:20
 */
@WebFilter("/*")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
//        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
//        throw new RuntimeException("我是Filter抛出的异常，测试BasicErrorController的作用");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
