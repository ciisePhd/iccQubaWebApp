package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistenceJPAConfig.class})
@ComponentScan(basePackages="org.iccQubaApp")
public class RepositoryAppConfig {

}