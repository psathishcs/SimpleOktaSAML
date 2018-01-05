package org.world.okta.saml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SimpleOktaSAMLApplication {
	public static void main(String args[]) throws Exception {
		SpringApplication.run(SimpleOktaSAMLApplication.class, args);
	}

	public boolean sayYesMethod() {
		return true;
	}
}
