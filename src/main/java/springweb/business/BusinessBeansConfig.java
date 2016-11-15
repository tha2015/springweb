package springweb.business;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessBeansConfig {

	@Bean
	public HelloBean getHelloBean() {
		return new HelloBean();
	}
}
