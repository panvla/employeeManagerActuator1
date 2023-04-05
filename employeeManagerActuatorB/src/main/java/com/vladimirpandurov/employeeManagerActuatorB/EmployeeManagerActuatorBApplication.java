package com.vladimirpandurov.employeeManagerActuatorB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class EmployeeManagerActuatorBApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerActuatorBApplication.class, args);
	}

	@Configuration
// @Profile("actuator-endpoints")
// if you want: register bean only if profile is set
	public class HttpTraceActuatorConfiguration {

		@Bean
		public HttpTraceRepository httpTraceRepository() {
			return new InMemoryHttpTraceRepository();
		}

	}

}
