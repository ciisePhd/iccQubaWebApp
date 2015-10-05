package spring.webservice;

import java.math.BigDecimal;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import spring.tutorial.service.IBanAcountService;
import spring.tutorial.service.UserDetails;
@Component("bankAcount")
@WebService(endpointInterface="spring.tutorial.service.IBanAcountService")
public class BankAcountServiceImpl implements IBanAcountService {

	@Override
	public void addUserDetails(UserDetails userDetails) {
		System.out.println("user added");
	}

	@Override
	public UserDetails getUserDetails(String userName) {
		// TODO Auto-generated method stub
		UserDetails details= new UserDetails();
		details.setName("mohammed");
		details.setBankBalance(new BigDecimal("999999.99"));
		return details;
	}

}
