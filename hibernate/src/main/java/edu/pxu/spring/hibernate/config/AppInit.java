package edu.pxu.spring.hibernate.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
	            AppContext.class
	        };
		// TODO Auto-generated method stub
		//return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[] {
		            WebMvcConfig.class
		        };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
	            "/"
	        };
	}
}
