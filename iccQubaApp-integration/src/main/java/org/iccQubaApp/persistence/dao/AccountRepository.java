package org.iccQubaApp.persistence.dao;

import java.util.List;

import org.iccQubaApp.persistence.model.Account;

/**
 * Loads account aggregates. Called by the reward network to find and
 * reconstitute Account entities from an external form such as a set of RDMS
 * rows.
 * 
 * Objects returned by this repository are guaranteed to be fully initialized
 * and ready to use.
 */
public interface AccountRepository {

	Account findOne(long id);

    List<Account> findAll();

    void create(Account entity);

    Account update(Account entity);

    void delete(Account entity);

    void deleteById(long entityId);

}