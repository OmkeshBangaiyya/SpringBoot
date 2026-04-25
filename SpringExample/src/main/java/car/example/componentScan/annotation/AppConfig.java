package car.example.componentScan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "car.example.componentScan.annotation")
public class AppConfig {
}
