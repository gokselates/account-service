package com.nilkerem.account.repository;

import com.nilkerem.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}
