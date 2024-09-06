package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@SpringBootApplication
//@EnableWebMvc // way 2
public class BootMvcProj17BeanNameViewResolverPdfExcelViewApplication {

	@Bean("resolver")
	BeanNameViewResolver createViewResolver() {
		System.out.println("BootMvcProj17BeanNameViewResolverPdfExcelViewApplication.createViewResolver()");
		BeanNameViewResolver resolver = new BeanNameViewResolver();
		resolver.setOrder(Ordered.HIGHEST_PRECEDENCE); // (way 1)
//		resolver.setOrder(1); // way 2
		return resolver;
	}

	/*
	 * @Bean // way 2 (enable this) bad practice 
	 * public InternalResourceViewResolver
	 * createIRVR() { InternalResourceViewResolver resolver = new
	 * InternalResourceViewResolver(); resolver.setPrefix("/WEB-INF/pages/");
	 * resolver.setSuffix(".jsp"); resolver.setOrder(10); return resolver; }
	 */

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj17BeanNameViewResolverPdfExcelViewApplication.class, args);
	}

}
