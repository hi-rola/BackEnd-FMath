package uv.mx.fei.fmath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class FmathApplication {

    public static void main(String[] args) {
        SpringApplication.run(FmathApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:4200")
                        .allowCredentials(true)
                        .allowedHeaders("Origin", "Authorization", "Content-Type")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "PATCH");
            }
        };
    }
}