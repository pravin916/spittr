package spittr.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected String[] getServletMappings() {
	return new String[] { "/" };
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
	return new Class<?>[] { RootConfig.class };
	}
	@Override
	protected Class<?>[] getServletConfigClasses() {
	return new Class<?>[] { WebConfig.class };
	}
	
}
