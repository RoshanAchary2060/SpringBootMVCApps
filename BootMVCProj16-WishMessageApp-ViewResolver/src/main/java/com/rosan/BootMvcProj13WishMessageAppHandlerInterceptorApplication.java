package com.rosan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.view.XmlViewResolver;

import jakarta.servlet.ServletContext;

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

	/*
	 * @Bean InternalResourceViewResolver createIRVR() { System.out.println(
	 * "BootMvcProj13WishMessageAppHandlerInterceptorApplication.createIRVR()");
	 * InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	 * resolver.setPrefix("/WEB-INF/pages/"); resolver.setSuffix(".jsp"); return
	 * resolver; }
	 */

	/*
	 * // @Bean // public ResourceBundleViewResolver createRBVR() { //
	 * ResourceBundleViewResolver resolver = new ResourceBundleViewResolver(); //
	 * resolver.setBasename("com/rosan/commons/views"); // return resolver; // }
	 */

	@Autowired
	private ServletContext sc;

	@Bean
	XmlViewResolver createXVR() {
		XmlViewResolver resolver = new XmlViewResolver();
		resolver.setLocation(new FileSystemResource(sc.getRealPath("/") + "WEB-INF/views.xml"));
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj13WishMessageAppHandlerInterceptorApplication.class, args);
	}

}
