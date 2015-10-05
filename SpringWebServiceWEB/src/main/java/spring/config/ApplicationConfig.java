package spring.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


import spring.tutorial.service.IBanAcountService;


@Configuration
@ImportResource({"classpath:META-INF/cxf/cxf.xml",
				 "classpath:META-INF/cxf/cxf-servlet.xml"})
@ComponentScan(basePackages="spring.webservice")
public class ApplicationConfig {

    @Autowired
    private Bus bus;
    


    @Autowired
    private IBanAcountService bankAcount;

    @Bean
    public Endpoint usersEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, bankAcount);
        endpoint.publish("/bankAcountService");
        return endpoint;
    }
    
    @Bean
    public ServletRegistrationBean webservices() {
        final ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new CXFServlet(),"/*");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }
}
