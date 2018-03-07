package com.example.demo;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/2/2.
 * 拦截器实体类
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //登录不做拦截
        if (httpServletRequest.getRequestURI().equals("/test/login_view")
                || httpServletRequest.getRequestURI().equals("/test/login")
                ) {

            return true;
        }
        //判断session是否存在
        Object o1 = httpServletRequest.getSession().getAttribute("session");
        if (o1 == null) {
            httpServletResponse.sendRedirect("/test/login_view");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
