package vttp2022.ssf.ssfworkshop11;

import java.util.Collections;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;


@SpringBootApplication
public class SsfWorkshop11Application {
	private static final Logger logger = LoggerFactory.getLogger(SsfWorkshop11Application.class);
	
	
			public static void main(String[] args) {
				SpringApplication app = new SpringApplication(SsfWorkshop11Application.class);
			
		
				
				String port = "3000";
				ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
				if(cliOpts.containsOption("port"))			
					port = cliOpts.getOptionValues("port").get(0);
				else if (System.getenv("PORT") != null)
					port = System.getenv("PORT");
				
				app.setDefaultProperties(
					Collections.singletonMap("server.port", port)
				);
				
		
				System.out.printf("\nApplication started on port %s\n", port);
				app.run(args);
				logger.info("this is a info message");
				logger.warn("this is a warn message");
				logger.error("this is a error message");
		
				//SpringApplication.run(DemoApplication.class, args);
			}
		
}
	