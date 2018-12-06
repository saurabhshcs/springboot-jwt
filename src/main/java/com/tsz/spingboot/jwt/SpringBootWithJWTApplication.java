/**
 * 
 */
package com.tsz.spingboot.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author saurabhshcs
 *
 */
@ComponentScan("com.tsz")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class SpringBootWithJWTApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJWTApplication.class, args);
	}

}
