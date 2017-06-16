package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Import;

import beans.CustomerBo;
import beans.SchedulerBo;


@Configuration
@Import({ CustomerBo.class, SchedulerBo.class })
//@ComponentScan(basePackages = {"beans"})
public class AppConfig {
	@Bean(name="customer")
	public CustomerBo customerBo(){
		
		return new CustomerBo();
		
	}
	
	@Bean(name="scheduler")
	public SchedulerBo suchedulerBo(){
		
		return new SchedulerBo();
		
	}
}