package org.iccQubaApp;

import java.util.List;

import org.iccQubaApp.persistence.dao.AccountRepository;
import org.iccQubaApp.persistence.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImp implements IAccountService {
	
	
	@Autowired
	private AccountRepository accountDao;
	
	
	public List<Account>  findAllAccount(String var) {
		return accountDao.findAll();
	}


}
