package com.i5i58.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:dubbo_consumer.xml")
public class dubboConfig {
}
