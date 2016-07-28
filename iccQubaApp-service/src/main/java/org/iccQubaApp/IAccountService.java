package org.iccQubaApp;

import java.util.List;

import org.iccQubaApp.persistence.model.Account;

public interface IAccountService {
	
	List<Account>  findAllAccount(String var);

}
