package com.rosan;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class BootMvcProj14InternationalizationApplication {

	@Bean("messageSource") // fixed bean id
	ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("com/rosan/commons/App");
		return source;
	}

	@Bean("localeResolver") // fixed bean id
	SessionLocaleResolver createSLResolver() {
		SessionLocaleResolver resolver = new SessionLocaleResolver();
		resolver.setDefaultLocale(Locale.ENGLISH);
		return resolver;
	}

	@Bean("lci") // not a fixed bean id
	LocaleChangeInterceptor createLCInterceptor() {
		LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
		interceptor.setParamName("lang");
		return interceptor;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj14InternationalizationApplication.class, args);
	}

}
