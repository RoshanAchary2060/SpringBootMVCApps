package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class BootMvcProj13WishMessageAppHandlerInterceptorApplication {

//	@Bean
//	UrlBasedViewResolver createUBVR() {
//		System.out.println("BootMvcProj13WishMessageAppHandlerInterceptorApplication.createUBVR()");
//		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
//		resolver.setPrefix("/WEB-INF/pages/");
//		resolver.setSuffix(".jsp");
//		resolver.setViewClass(InternalResourceView.class);
//		return resolver;
//	}

	@Bean
	InternalResourceViewResolver createIRVR() {
		System.out.println("BootMvcProj13WishMessageAppHandlerInterceptorApplication.createIRVR()");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj13WishMessageAppHandlerInterceptorApplication.class, args);
	}

}
