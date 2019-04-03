package com.oss.shop.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import org.springframework.web.util.ContentCachingRequestWrapper;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class BadMediaFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest cachedRequest
                = new ContentCachingRequestWrapper((HttpServletRequest) servletRequest);
        //invoke caching
        cachedRequest.getParameterMap();
        chain.doFilter(cachedRequest, servletResponse);
    }
}