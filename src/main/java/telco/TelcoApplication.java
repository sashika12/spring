package telco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
@EnableWebMvc
public class TelcoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelcoApplication.class, args);
	}
	
	@Bean  
    public InternalResourceViewResolver viewResolver() {  
	InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/views/");  
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }

}
