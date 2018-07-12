package com.berg.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    /**
     * 指定配置类
     * @return      返回配置类
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    /**
     * 将DispatcherServlet映射到"/"
     * @return      返回映射路径
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/", "*.service"};
    }
}
