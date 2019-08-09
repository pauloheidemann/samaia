package br.com.samaia.crudPF;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Paulo Henrique Heidemann
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"br.com.samaia.crudPF"})
@EntityScan(basePackages = {"br.com.samaia.crudPF.bean"})
public class Configurator extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Configurator.class);
	}

}