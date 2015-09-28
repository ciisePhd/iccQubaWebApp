package org.iccQubaApp;

import org.iccQubaApp.persistence.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serviceTest")
public class ServiceTest implements IServiceTest {
	
	
	@Autowired
	private AccountRepository accountDao;
	
	
	public String test(String var) {
		return " count of available acounts is : "+accountDao.findAll().size();
	}


}
