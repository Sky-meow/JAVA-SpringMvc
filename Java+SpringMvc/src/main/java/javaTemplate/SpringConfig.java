package javaTemplate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "javaTemplate")
@PropertySource("classpath:application.properties")
@Import({ JDBCTemplateConfig.class })
public class SpringConfig {

}
