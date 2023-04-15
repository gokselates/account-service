package com.nilkerem.account.converter;

import com.nilkerem.account.dto.TransactionDto;
import com.nilkerem.account.model.Transaction;

public class TransactionDtoConverter {

    public TransactionDto convert(Transaction from){

        return new TransactionDto(from.getId(),
                from.getTransactionType(),
                from.getAmount(),
                from.getTransactionDate());
    }
}
