/**
 * 
 */
package com.learn.day.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application Bootstrap class. which start the embedded server for the
 * springboot.
 * j
 * @author Anand Singh <email: avsmips@gmail.com>
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.learn.**"})
public class AppBootstrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AppBootstrap.class);
//		application.setBannerMode(Mode.OFF);
		application.run(args);
	}

}
