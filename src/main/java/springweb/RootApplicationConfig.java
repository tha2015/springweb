package springweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootApplicationConfig {

	@Bean
	public HelloBean getHelloBean() {
		return new HelloBean();
	}
}
