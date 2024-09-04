package com.rosan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication
public class BootMvcProj15FIleUploadingAndDownloadingApplication {

	@Bean("multipartResolver")
	public CommonsMultipartResolver createCMResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSize(-1); // -1 indicates no limit
		resolver.setMaxUploadSizePerFile(-1);
		resolver.setPreserveFilename(true);
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj15FIleUploadingAndDownloadingApplication.class, args);
	}

}
