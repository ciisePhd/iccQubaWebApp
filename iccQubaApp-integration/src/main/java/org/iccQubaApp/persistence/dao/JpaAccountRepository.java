package org.iccQubaApp.persistence.dao;


import org.iccQubaApp.persistence.model.Account;
import org.springframework.stereotype.Repository;

/**
 * Finds account objects using the JPA API.
 */
@Repository("accountDao")
public class JpaAccountRepository extends AbstractJpaDAO<Account> implements AccountRepository {
	
	public JpaAccountRepository() {
        super();

        setClazz(Account.class);
    }


	
}
