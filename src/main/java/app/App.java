package app;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.CustomerBo;
import beans.SchedulerBo;
import config.AppConfig;
 
public class App {
	public static void main(String[] args) {
	    
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
	    
		CustomerBo customer = (CustomerBo)appContext.getBean("customer");
	    customer.printMsg("Hello 1");
	    
	    SchedulerBo scheduler = (SchedulerBo)appContext.getBean("scheduler");
	    scheduler.printMsg("Hello 2");

	}
}