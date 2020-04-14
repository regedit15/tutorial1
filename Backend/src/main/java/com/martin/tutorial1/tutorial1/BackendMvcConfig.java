package com.martin.tutorial1.tutorial1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BackendMvcConfig implements WebMvcConfigurer {

	@Value("${settings.cors_origin}")
	private String settingsCorsOrigin;

	@Value("${settings.cors_origin_opcional}")
	private String settingsCorsOriginOpcional;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins(settingsCorsOrigin, settingsCorsOriginOpcional);
	}

}
