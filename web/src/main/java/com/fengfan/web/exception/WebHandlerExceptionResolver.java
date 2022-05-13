package com.fengfan.web.exception;

import com.fengfan.web.entity.WebResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fengfan
 * @description controller异常处理类
 * @date 2022/5/11 16:35
 */
public class WebHandlerExceptionResolver extends AbstractHandlerExceptionResolver {

    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response,
                                              Object handler, Exception ex) {
        ex.printStackTrace();
        ModelAndView mv = new ModelAndView(new MappingJackson2JsonView());
        WebResponse webResponse = new WebResponse();
        webResponse.setCode(-1);
        webResponse.setType("error");
        webResponse.setMessage(ex.getMessage());
        mv.addAllObjects(webResponse.toMap());
        return mv;
    }
}
