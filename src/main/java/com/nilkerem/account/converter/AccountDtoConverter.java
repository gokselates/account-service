package com.nilkerem.account.converter;


import com.nilkerem.account.dto.AccountDto;
import com.nilkerem.account.model.Account;
import com.nilkerem.account.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class AccountDtoConverter {

    public final CustomerDtoConverter customerDtoConverter;
    public final TransactionDtoConverter transactionDtoConverter;

    public AccountDtoConverter(CustomerDtoConverter customerDtoConverter, TransactionDtoConverter transactionDtoConverter) {
        this.customerDtoConverter = customerDtoConverter;
        this.transactionDtoConverter = transactionDtoConverter;
    }

    public AccountDto convert(Account from){

        return new AccountDto(from.getId(),
                from.getBalance(),
                from.getCreationDate(),
                customerDtoConverter.convertToAccountCustomer(from.getCustomer()),
                from.getTransaction().stream().map( transactionDtoConverter::convert).collect(Collectors.toSet())
                );
    }

}
