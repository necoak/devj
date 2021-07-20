package com.myframework;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

// import io.undertow.util.CanonicalPathUtils;  // necoak - 暫定でやる(実際にはビルド時参照にする)

/*
@WebFilter(
        urlPatterns = {"/*"},
        dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.INCLUDE, DispatcherType.FORWARD,
                DispatcherType.ERROR, DispatcherType.ASYNC})
*/
@WebFilter("/*")
public class ExampleServletFilter implements Filter {

    private static final Logger log = Logger.getLogger(ExampleServletFilter.class.getName());
    protected FilterConfig filterConfig = null;

    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {


        if (!(request instanceof HttpServletRequest)) {
            chain.doFilter(request, response);
            return;
        }

        HttpServletRequest httpRequest = (HttpServletRequest) request;

        //
        log.info("DispatcherType: " + httpRequest.getDispatcherType() + " ServletPath: " + httpRequest.getServletPath());

        HttpServletRequestWrapper wrappedRequest = new HttpServletRequestWrapper(httpRequest) {
            @Override
            public RequestDispatcher getRequestDispatcher(final String path) {
                final String canonicalPath = CanonicalPathUtils.canonicalize(path);
                log.info("specified path = " + path + " -> canonicalized path = " + canonicalPath);
                return httpRequest.getRequestDispatcher(canonicalPath);
            }
        };

        chain.doFilter(wrappedRequest, response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {
    }

}