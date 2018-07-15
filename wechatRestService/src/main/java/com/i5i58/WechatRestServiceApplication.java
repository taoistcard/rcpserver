package com.i5i58;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.i5i58"})
@EnableAutoConfiguration
public class WechatRestServiceApplication implements EmbeddedServletContainerCustomizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(WechatRestServiceApplication.class, args);
		try {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://localhost:6976/swagger-ui.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(6976);		
	}

}
